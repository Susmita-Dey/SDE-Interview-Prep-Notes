import React, { useCallback, useEffect, useState } from "react";
import "../App.css";
import SuggestionsList from "./suggestions-list";
import debounce from "lodash";

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

  // eslint-disable-next-line react-hooks/exhaustive-deps
  const getSuggestionsDebounced = useCallback(
    debounce(getSuggestions, 300),
    []
  );

  useEffect(() => {
    if (inputValue.length > 1) {
      getSuggestionsDebounced(inputValue);
    } else {
      setSuggestions([]);
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [inputValue]);

  const handleSuggestionClick = (suggestion) => {
    setInputValue(datakey ? suggestion[datakey] : dataKey);
    onSelect(suggestion);
    setSuggestions([]);
  };

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
        <ul className="suggestions-list">
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
