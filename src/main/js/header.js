const React = require("react");
const ReactDOM = require("react-dom");


const Header = (props) => {
	return(
		<nav className="navbar navbar-default" role="navigation">
			<div className="container-fluid">
			  <div className="navbar-collapse collapse">
			    <ul className="nav navbar-nav">
			        <li>
			        	<div style={{margin: '1em', display: 'inline-block'}}>
			        		<img width="75" src={props.img}/>
			        		<div style={{display: 'inline-block', marginLeft: '10px'}}>
			        			<div style={{fontSize: '1.25em', fontWeight: 'bold'}}>{props.name}</div>
			        			<div>{props.email}</div>
			        		</div>
			        	</div>
			        </li>
			    </ul>
			    <ul className="nav navbar-nav navbar-center">
			        <li>
			        	<select  className="main-dropdown">
						    	<option>Bitcoin</option>
						    	<option>Ethereum</option>
						    	<option>Ripple</option>
						    	<option>FIAT</option>
			          </select>
			        </li>
			    </ul>
			    <ul className="nav navbar-nav navbar-right">
			        <li>
			        	<a href="#" style={{color: 'black'}}>
			        		Sign Out <img src="/images/logout.png"/>
			        	</a>
			        </li>
			    </ul>
			  </div>
		  </div>
		</nav>
	);
}


module.exports = Header;