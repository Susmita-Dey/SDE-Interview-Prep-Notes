import React from "react";
import "./notification.css";
import { AiOutlineCheckCircle, AiOutlineInfoCircle, AiOutlineWarning, AiOutlineCloseCircle } from "react-icons/ai";

const icons = {
  success: <AiOutlineCheckCircle />,
  info: <AiOutlineInfoCircle />,
  warning: <AiOutlineWarning />,
  error: <AiOutlineCloseCircle />,
};

const Notification = ({ type = "info", message, onClose }) => {
  return (
    <div className={`notification ${type}`}>
      {/* icon */}
      {icons[type]}
      {/* message */}
      {/* close button */}
    </div>
  );
};

export default Notification;
