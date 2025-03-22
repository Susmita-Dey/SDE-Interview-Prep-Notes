import "./App.css";
import Autocomplete from "./components/autocomplete";

function App() {
  const staticData = [
    "Pasta",
    "Pizza",
    "Burger",
    "Sandwich",
    "Noodles",
    "Pancake",
    "Waffles",
    "Tacos",
    "Burritos",
    "Sushi",
    "Ramen",
    "Donut",
    "Ice Cream",
    "Cake",
    "Cookies",
    "Brownies",
  ];

  const fetchSuggestions = async (query) => {
    const response = await fetch(
      `https://dummyjson.com/recipes/search?q=${query}`
    );
    if (!response.ok) {
      throw new Error("Failed to fetch suggestions");
    }
    const result = await response.json();
    return result.recipes;
  };

  return (
    <div>
      <h1>Autocomplete/Typeahead</h1>
      <Autocomplete
        placeholder={"Enter Recipe Name"}
        staticData={staticData}
        fetchSuggestions={fetchSuggestions}
        datakey={"name"}
        customLoading={<div>Loading Recipes...</div>}
        onSelect={(res) => console.log(res)}
        onChange={(input) => {
          console.log(input);
        }}
        onBlur={(e) => {
          console.log(e);
        }}
        onFocus={(e) => {
          console.log(e);
        }}
        customStyles={{}}
      />
    </div>
  );
}

export default App;
