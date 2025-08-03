import React from 'react';

export const Scorebelow70 = ({ players }) => {
  const filtered = players.filter((item) => item.score <= 70);

  return (
    <div>
      {filtered.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </div>
  );
};
