'use strict';

// tag::vars[]
const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {transactions: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/txTransactions'}).done(response => {
			this.setState({transactions: response.entity._embedded.txTransactions});
		});
	}

	render() {
		return (
			<div>
		    	<TableTitle />
			    <TransactionList transactions={this.state.transactions}/>
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
						<th>Tx ID</th>
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

// tag::render[]
ReactDOM.render(<App />,react)
// end::render[]

