import React from 'react';
import './App.css';

const offices = [
  {
    id: 1,
    name: 'Space Hub',
    rent: 10000,
    address: 'Hyderabad, Telangana',
    image: 'image.png'
  },
  {
    id: 2,
    name: 'Space Office',
    rent: 3000,
    address: 'Bangalore, Karnataka',
    image: 'image.png'
  }
];

function App() {
  return (
    <div className="App">
      <h1 className="main-heading">Office Rental App</h1>
      <div className="office-container">
        {offices.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h3>Name: {office.name}</h3>
            <p className={office.rent > 6000 ? 'green' : 'red'}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
            <p><strong>Address:</strong> {office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;