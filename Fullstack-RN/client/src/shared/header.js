import React, { Component } from 'react';
import logo from '../logo.svg';

class Header extends Component {
    render() {
        return (
            <div className="header">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    {/* <p>
          Edit <code>src/App.js</code> and save to reload.
        </p> */}
                    <a
                        className="App-link"
                        href="https://reactjs.org"
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                    </a>
                </header>
            </div>
        );
    }
}

export default Header