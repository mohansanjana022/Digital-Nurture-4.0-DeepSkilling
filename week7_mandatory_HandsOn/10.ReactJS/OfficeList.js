import React from 'react';

export const OfficeList = () => {
  const offices = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai', src: 'https://tse1.mm.bing.net/th/id/OIP.SZojp8t4SviLb-RSkhD0KwHaLH?pid=Api&P=0&h=180' },
    { Name: 'WeWork', Rent: 75000, Address: 'Bangalore', src: 'https://tse4.mm.bing.net/th/id/OIP.wr5LfdADKcmepPCZOrhgZwHaLG?pid=Api&P=0&h=180' },
    { Name: 'Regus', Rent: 60000, Address: 'Hyderabad', src: 'https://tse1.mm.bing.net/th/id/OIP.MRsEtK9VzaIMtZ5FNQmJiQHaD4?pid=Api&P=0&h=180' },
  ];

  const heading = "Office Space";

  return (
    <div style={{ backgroundColor: '#eee', padding: '20px' }}>
      <h1>{heading}, at Affordable Range</h1>

      {offices.map((item, index) => {
        const rentColor = item.Rent <= 60000 ? 'red' : 'green';

        return (
          <div key={index} style={{ margin: '30px 0' }}>
            <img src={item.src} width="200" height="200" alt={item.Name} />
            <h2>Name: {item.Name}</h2>
            <h3 style={{ color: rentColor }}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
};
