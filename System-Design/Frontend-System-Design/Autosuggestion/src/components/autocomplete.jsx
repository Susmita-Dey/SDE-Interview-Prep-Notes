import React, { useEffect, useState } from "react";
import "../App.css";
import SuggestionsList from "./suggestions-list";

const Autocomplete = ({
  placeholder = "",
  staticData,
  fetchSuggestions,
  datakey = "",
  customLoading = "Loading Recipes...",
  onSelect = () => {},
  onChange = () => {},
  onBlur = () => {},
  onFocus = () => {},
  customStyles = {},
  dataKey = "",
}) => {
  const [inputValue, setInputValue] = useState("");
  const [suggestions, setSuggestions] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(false);

  const handleInputChange = (e) => {
    setInputValue(e.target.value);
    onChange(e.target.value);
  };

  const getSuggestions = async (query) => {
    setError(null);
    setLoading(true);
    try {
      let result;
      if (staticData) {
        result = staticData.filter((item) =>
          item.toLowerCase().includes(query.toLowerCase())
        );
      } else if (fetchSuggestions) {
        result = await fetchSuggestions(query);
      }

      setSuggestions(result);
    } catch (error) {
      setError("Failed to fetch suggestions", error);
      setSuggestions([]);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    if (inputValue.length > 1) {
      getSuggestions(inputValue);
    } else {
      setSuggestions([]);
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [inputValue]);

  const handleSuggestionClick = () => {};

  return (
    <div className="container">
      <input
        type="text"
        value={placeholder}
        style={customStyles}
        onBlur={onBlur}
        onFocus={onFocus}
        onChange={handleInputChange}
      />
      {(suggestions.length > 0 || loading || error) && (
        <ul>
          {loading && <div className="loading">{customLoading}</div>}
          {error && <div className="error">{error}</div>}
          <SuggestionsList
            datakey={dataKey}
            highlight={inputValue}
            suggestions={suggestions}
            onSuggestionsClick={handleSuggestionClick}
          />
        </ul>
      )}
    </div>
  );
};

export default Autocomplete;
