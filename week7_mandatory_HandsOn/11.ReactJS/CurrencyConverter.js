import React, { useState } from "react";

function CurrencyConverter() {
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  function handleSubmit() {
    if (currency.toLowerCase() === "euro") {
      const converted = parseFloat(amount) * 0.8;
      alert(`Converting to Euro. Amount is ${converted}`);
    } else {
      alert("Please enter 'Euro' in the Currency field.");
    }
  }

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <label>Amount: </label>
      <input
        type="number"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
      /><br/>
      <label>Currency: </label>
      <input
        type="text"
        value={currency}
        onChange={(e) => setCurrency(e.target.value)}
      /><br/>
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default CurrencyConverter;
