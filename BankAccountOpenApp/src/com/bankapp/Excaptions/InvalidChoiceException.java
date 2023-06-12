package com.bankapp.Excaptions;

public class InvalidChoiceException extends Exception
{
	public InvalidChoiceException()
	{
		
	}
	public InvalidChoiceException(String msg)
	{
		super(msg);
	}
}
