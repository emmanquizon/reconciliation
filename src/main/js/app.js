"use strict";

// tag::vars[]
const React = require("react");
const ReactDOM = require("react-dom");
const client = require("./client");
const Doughnut = require("react-chartjs-2").Doughnut;
const Header = require("./header");
const follow = require('./follow'); 
const root = '/api';
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {transactions: [], attributes: [], pageSize: 10, links: {} ,page: {}, 
					data: {
						    labels: ["Mathematics", "Chemistry", "Physics"],
						    datasets: [{
						      backgroundColor: [
						          "#46C9B8",
						          "#F76775",
						          "#6F58FF"
						      ],
						      data: [50, 25, 25]
						    }]
						  }
						};
		this.updatePageSize = this.updatePageSize.bind(this);
		this.onNavigate = this.onNavigate.bind(this);
		this.onSearch = this.onSearch.bind(this);
	}

	loadFromServer(pageSize){
		follow(client, root, [
			{rel: 'txTransactions', params: {size: pageSize}}]
		).then(transactionCollection => {
			return client({
				method: 'GET',
				path: transactionCollection.entity._links.profile.href,
				headers: {'Accept': 'application/schema+json'}
			}).then(schema => {
				this.schema = schema.entity;
				return transactionCollection;
			});
		}).done(transactionCollection => {
			this.setState({
				transactions: transactionCollection.entity._embedded.txTransactions,
				attributes: Object.keys(this.schema.properties),
				pageSize: pageSize,
				links: transactionCollection.entity._links,
				page: transactionCollection.entity.page});
		});
	}
	
	onNavigate(navUri){
		client({method: 'GET', path: navUri}).done(transactionCollection => {
			this.setState({
				transactions: transactionCollection.entity._embedded.txTransactions,
				attributes: this.state.attributes,
				pageSize: this.state.pageSize,
				links: transactionCollection.entity._links,
				page: transactionCollection.entity.page
			});
		});
	}
	
	onSearch(paramsX){
		
		follow(client, '/api/txTransactions/search', [
			{rel: 'findByTxnId', params: paramsX}]
		).then(transactionCollection => {
			return transactionCollection;
			
		}).done(transactionCollection => {
			this.setState({
				transactions: transactionCollection.entity._embedded.txTransactions,
				attributes: this.state.attributes,
				pageSize: paramsX.page,
				links: transactionCollection.entity._links,
				page: transactionCollection.entity.page});
		});
	}
	
	updatePageSize(pageSize){
		if (pageSize !== this.state.pageSize) {
			this.loadFromServer(pageSize);
		}
	}
	
	componentDidMount() {
		this.loadFromServer(this.state.pageSize);
	}
	
	render() {
		return (
			<div>
				<Header img={"/images/img_avatar.png"} name={"Emman Quizon"} email={"emmanquizon04@gmail.com"}/>
				<div className="container pad-bot-10-em">
					<LegendList />
					<div className="ib">
					<Graph data={this.state.data} title={"Pending Transactions"} legend={false}/>
					<Graph data={this.state.data} title={"Exceptions"} legend={false}/>
					<Graph data={this.state.data} title={"Successfully Matched"}  legend={false}/>
					</div>
					<div>		
					<TableTitle />
				    <TransactionList transactions={this.state.transactions} 
				    	links={this.state.links}
					  	pageSize={this.state.pageSize}
					  	onNavigate={this.onNavigate}
				    	updatePageSize={this.updatePageSize}
				    	onSearch={this.onSearch}
				    	page={this.state.page}/>
				    </div>
				</div>
			</div>
		)
	}
}
// end::app[]

// tag::employee-list[]
class TransactionList extends React.Component{
	
	constructor(props) {
		super(props);
		this.handleNavFirst = this.handleNavFirst.bind(this);
		this.handleNavPrev = this.handleNavPrev.bind(this);
		this.handleNavNext = this.handleNavNext.bind(this);
		this.handleNavLast = this.handleNavLast.bind(this);
		this.handleInput = this.handleInput.bind(this);
		this.handleSearch = this.handleSearch.bind(this);
	}
	
	handleInput(){
		var pageSize = ReactDOM.findDOMNode(this.refs.pageSize).value;
		var txnID = ReactDOM.findDOMNode(this.refs.txnId).value;
		if (/^[0-9]+$/.test(pageSize)) {
			if(txnID != ""){
				this.props.onSearch({size:pageSize,txnId:txnID});
			}else{
				this.props.updatePageSize(pageSize);
			}
		} else {
			ReactDOM.findDOMNode(this.refs.pageSize).value = pageSize.substring(0, pageSize.length - 1);
		}
	}
	
	handleSearch(){
		var txnID = ReactDOM.findDOMNode(this.refs.txnId).value;
		var pageSize = ReactDOM.findDOMNode(this.refs.pageSize).value;
		if(txnID == ""){
			this.props.updatePageSize(pageSize);
		}else{
			this.props.onSearch({size:pageSize,txnId:txnID});
		}
		
	}
	
	handleNavFirst(){
		this.props.onNavigate(this.props.links.first.href);
	}

	handleNavPrev(){
		this.props.onNavigate(this.props.links.prev.href);
	}

	handleNavNext(){
		this.props.onNavigate(this.props.links.next.href);
	}

	handleNavLast(){
		this.props.onNavigate(this.props.links.last.href);
	}

	pageLabel(){
		let number = this.props.page.number;
		let size = this.props.page.size;
		let totalElements = this.props.page.totalElements;
		let lastCount;
		if(totalElements === 0 ){
			return (
					<div className="btn-group pull-left">
						<strong>No results found</strong>.
					</div>
				);
		}else if((number + 1) * size >= totalElements){
			lastCount = totalElements;
		}else{
			lastCount = ((number + 1) * size);
		}
		return (
				<div className="btn-group pull-left">
					Showing <strong>{((number*size)+1)}</strong> to <strong>{lastCount}</strong> of <strong>{totalElements}</strong>.
				</div>
			);
			
	}
	
	render() {
		var transactions = this.props.transactions.map(transaction =>
			<Transaction key={transaction._links.self.href} transaction={transaction}/>
		);
		var navLinks = [];
		if ("first" in this.props.links) {
			navLinks.push(<button key="first"  disabled={this.props.page.number === 0} className="btn btn-default" onClick={this.handleNavFirst}><strong>First</strong></button>);
		}
		if ("prev" in this.props.links) {
			navLinks.push(<button key="prev" className="btn btn-default" onClick={this.handleNavPrev}><strong>Prev</strong></button>);
		}
		if ("next" in this.props.links) {
			navLinks.push(<button key="next" className="btn btn-default" onClick={this.handleNavNext}><strong>Next</strong></button>);
		}
		if ("last" in this.props.links) {
			navLinks.push(<button key="last"  disabled={(this.props.page.number + 1) === this.props.page.totalPages} className="btn btn-default" onClick={this.handleNavLast}><strong>Last</strong></button>);
		}
		
		return (
			<div>
				<strong>Show : </strong><input ref="pageSize" style={{width:'100px'}} defaultValue={this.props.pageSize} onInput={this.handleInput}/>
				<div className="pull-right col-md-4">
					<input placeholder="Txn ID" ref="txnId" style={{width:'100%', fontSize:'12px'}}  onInput={this.handleSearch}/>
				</div>		
				<table className="transactionsTbl">
					<tbody>
						<tr>
							<th>Transaction ID</th>
							<th>Address</th>
							<th>Amount</th>
							<th>Fee</th>
							<th>Time</th>
							<th>Type</th>
							<th>Matched</th>
						</tr>
						{transactions}
					</tbody>
				</table>
				<div>
					{this.pageLabel()}
					<div className="btn-group pull-right">
						{navLinks}
					</div>
				</div>
			</div>
		)
	}
}
// end::employee-list[]

// tag::employee[]
const Transaction = (props) =>{
	return (
		<tr>
			<td>{props.transaction.txnId}</td>
			<td>{props.transaction.address}</td>
			<td>{props.transaction.amount}</td>
			<td>{props.transaction.fee}</td>
			<td>{props.transaction.time}</td>
			<td>{props.transaction.type}</td>
			<td>{String(props.transaction.hasMatched)}</td>
		</tr>
	);
}
// end::employee[]

const TableTitle = () => {
	return(
		<h2> Table of Exceptions </h2>
	);
}

const Graph = (props) => {
	return(
		<div className="ib text-center">
			<div style={{width: '450px', height: '260px', float: 'left', position: 'relative'}}>
				<div style={{width: '100%', height: '120px', position: 'absolute',top: '50%', left: 0, marginTop: '-20px', lineHeight:'19px', textAlign: 'center', zIndex: '-999999999999999'}}>
			    99%<br/>
			    </div>
			    <Doughnut 
				data={props.data}
				options={
			    		 
			  	{
			  		cutoutPercentage:80,
			  		legend: {
	    	            display: props.legend
	    	         },
			  	}
			    } />
			</div>
			<h4>{props.title}</h4>
		</div>
	);
}

const LegendList = (props) => {
	return(
		<div className="ib">
			<Legend color={"#46C9B8"} name={"Mathematics"} />
			<Legend color={"#F76775"}  name={"Chemistry"} />
			<Legend color={"#6F58FF"}  name={"Physics"} />
		</div>
	);
}

const Legend = (props) => {
	return(
		<div>
			<span style={{fontSize: '20px', color: props.color}}>&#9632;</span> {props.name}
		</div>
	);
}



// tag::render[]
ReactDOM.render(<App />,react)
// end::render[]

