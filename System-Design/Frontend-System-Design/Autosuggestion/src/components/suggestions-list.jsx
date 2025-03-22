import React from "react";

const SuggestionsList = ({
  suggestions = [],
  highlight,
  datakey,
  onSuggestionsClick,
}) => {
  const getHightightedText = (text, highlight) => {
    return text;
  };

  return (
    <React.Fragment>
      {suggestions.map((suggestion, index) => {
        const currSuggestion = datakey ? suggestion[datakey] : suggestion;

        return (
          <li
            key={index}
            onClick={() => onSuggestionsClick(suggestion)}
            className="suggestion-item"
          >
            {getHightightedText(currSuggestion, highlight)}
          </li>
        );
      })}
    </React.Fragment>
  );
};

export default SuggestionsList;
