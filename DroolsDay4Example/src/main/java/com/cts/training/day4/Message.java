package com.cts.training.day4;

public class Message {

	public static final int HELLO = 0;
	public static final int GOODBYE = 1;
	
	private String text;
	private String message;
	private int Status;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	
}
