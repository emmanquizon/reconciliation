'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');




class HeaderClass extends React.Component {
    render() {
        return (<div className="row">
            <div className="col-sm-12">
                <nav className="headermenu">
                    <div className="container-fluid">
                        <div className="navbar-header"></div>
                        <ul className="nav navbar-nav navbar-left">
                            <li><a href="#"><span className="fa fa-user-circle mar-r-10"></span>
                                Jeriel Francis Mercado</a></li>
                        </ul>

                        
                        <ul className="nav navbar-nav navbar-right">
                            <li><a href="/logout" id="logoutId">Sign Out<span
                                className="fa fa-sign-out mar-l-10"></span> </a></li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>);
    }
}

module.exports = HeaderClass;

