import React from "react";

const SuggestionsList = ({
  suggestions = [],
  highlight,
  datakey,
  onSuggestionsClick,
}) => {
  const getHightightedText = (text, highlight) => {
    const parts = text.split(new RegExp(`(${highlight})`, "gi"));
    console.log(parts);

    return (
      <span>
        {parts.map((part, index) =>
          part.toLowerCase() === highlight.toLowerCase() ? (
            <strong key={index}>{part}</strong>
          ) : (
            part
          )
        )}
      </span>
    );
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
