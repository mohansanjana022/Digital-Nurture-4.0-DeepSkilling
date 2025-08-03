import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
    sayHello(); // This also shows Hello message
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello Member1!");
  }

  function sayMessage(message) {
    alert(message);
  }

  function handleClick(event) {
    alert("I was clicked");
  }

  return (
    <div>
      <h1>{count}</h1>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={() => sayMessage("welcome")}>Say Welcome</button>
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
}

export default Counter;
