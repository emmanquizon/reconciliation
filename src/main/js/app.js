'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
import HeaderClass from './header.js';
const Doughnut = require("react-chartjs-2").Doughnut;
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {transactions: [], 
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
					  } };
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/txTransactions'}).done(response => {
			this.setState({transactions: response.entity._embedded.txTransactions});
		});
	}
	
	render() {
		return (
			<div>
				<HeaderClass/>
				<div className="container">
					<div className="ib">
					<Graph data={this.state.data} title={"Pending Transactions"}/>
					<Graph data={this.state.data} title={"Exceptions"}/>
					<Graph data={this.state.data} title={"Successfully Matched"}/>
					</div>
					<div>		
					<TableTitle />
					<TransactionList transactions={this.state.transactions}/>
					</div>
				</div>
			</div>
		)
	}
}
// end::app[]

// tag::employee-list[]
class TransactionList extends React.Component{
	render() {
		var transactions = this.props.transactions.map(transaction =>
			<Transaction key={transaction._links.self.href} transaction={transaction}/>
		);
		console.log(transactions)
		return (
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
		)
	}
}
// end::employee-list[]

// tag::employee[]
class Transaction extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.transaction.txnId}</td>
				<td>{this.props.transaction.address}</td>
				<td>{this.props.transaction.amount}</td>
				<td>{this.props.transaction.fee}</td>
				<td>{this.props.transaction.time}</td>
				<td>{this.props.transaction.type}</td>
				<td>{String(this.props.transaction.hasMatched)}</td>
			</tr>
		)
	}
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
			  		cutoutPercentage:80
			  	}
			    } />
			</div>
			<h4>{props.title}</h4>
		</div>
	);
}

// tag::render[]
ReactDOM.render(<App />,react)
// end::render[]

