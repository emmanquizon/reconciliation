'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');




class HeaderClass extends React.Component {
    constructor() {
        super();

        this.state = {
            showMenu: false,
        };

        this.showMenu = this.showMenu.bind(this);
        this.closeMenu = this.closeMenu.bind(this);
    }

    showMenu(event) {
        event.preventDefault();

        this.setState({ showMenu: true }, () => {
            document.addEventListener('click', this.closeMenu);
        });
    }

    closeMenu(event) {

        if (!this.dropdownMenu.contains(event.target)) {

            this.setState({ showMenu: false }, () => {
                document.removeEventListener('click', this.closeMenu);
            });

        }
    }
    render() {
        return (<div className="row">
            <div className="col-sm-12">
                <nav className="headermenu">
                    <div className="container-fluid">
                        <div className="navbar-header"></div>

                        <ul className="nav navbar-nav">
                            <li className="pull-left"><a href="#"><span className="fa fa-user-circle mar-r-10"></span>
                                Jeriel Francis Mercado</a></li>
                            <li>
                                <button onClick={this.showMenu}>
                                    Show menu

                                </button>
                                {
                                    this.state.showMenu
                                        ? (
                                            <div
                                                className="menu"
                                                ref={(element) => {
                                                    this.dropdownMenu = element;
                                                }}
                                            >
                                                <button> Menu item 1 </button>
                                                <button> Menu item 2 </button>
                                                <button> Menu item 3 </button>
                                            </div>
                                        )
                                        : (
                                            null
                                        )
                                }
                            </li>
                            <li className="pull-right">
                                <a href="/logout" id="logoutId">Sign Out<span
                                    className="fa fa-sign-out mar-l-10"></span> </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>);
    }
}

module.exports = HeaderClass;

