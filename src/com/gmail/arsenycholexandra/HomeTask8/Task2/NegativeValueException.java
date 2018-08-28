package com.gmail.arsenycholexandra.HomeTask8.Task2;

public class NegativeValueException extends Exception {
	
	private String messageText;

	public NegativeValueException(String messageText) {
		super();
		this.messageText = messageText;
	}
	
	public NegativeValueException() {
		super();
	}

	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return messageText;
	}
}

