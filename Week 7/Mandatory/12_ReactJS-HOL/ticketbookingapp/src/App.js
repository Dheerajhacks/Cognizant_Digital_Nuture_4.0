import React, { useState } from 'react';

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function GuestGreeting() {
  return (
    <div>
      <h2>Welcome</h2>
      <p>Book tickets here</p>
      <ul>
        <li>1st flight – Hyderabad to Delhi</li>
        <li>2nd flight – Mumbai to Dubai</li>
        <li>3rd flight – South Korea to London</li>
      </ul>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h2>Welcome</h2>
      <p>Book tickets here</p>
      <ul>
        <li>1st flight –  Hyderabad to New York <button>Book</button></li>
        <li>2nd flight – Vizag to Singapore <button>Book</button></li>
        <li>3rd flight – South Korea to London <button>Book</button></li>
      </ul>
    </div>
  );
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}
      <Greeting isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;