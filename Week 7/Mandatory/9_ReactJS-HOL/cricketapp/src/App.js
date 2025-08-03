import React from 'react';
import ListofPlayers from './Components/ListofPlayers';
import OddEvenPlayers from './Components/OddEvenPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = false;

  return (
    <div>
        {flag ? (
          <ListofPlayers />
      ) : (
        <>
          <OddEvenPlayers />
          <IndianPlayers />
        </>
      )}
    </div>
  );
}

export default App;