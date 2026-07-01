import { useState } from "react";

function App() {
  const firstName = "Praveen";
  const lastName = "Rai";

  const [count, setCount] = useState(1);

  const handleClick = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <h2>
        {firstName}{" "}
        {Array(count).fill(lastName).join(" ")}
      </h2>

      <button onClick={handleClick}>
        Click me
      </button>
    </div>
  );
}

export default App;