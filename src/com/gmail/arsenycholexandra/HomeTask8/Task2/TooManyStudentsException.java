package com.gmail.arsenycholexandra.HomeTask8.Task2;

public class TooManyStudentsException extends Exception {
	private String messageText;

	public TooManyStudentsException(String messageText) {
		super();
		this.messageText = messageText;
	}
	
	public TooManyStudentsException() {
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

