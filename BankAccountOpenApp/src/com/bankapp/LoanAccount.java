package com.bankapp;

import java.util.Scanner;

public class LoanAccount extends SavingAccount
{
	float LoanAmountint = (9/100);
	
	public LoanAccount(int sid, String sname, float sbal) 
	{
		super(sid, sname, sbal);
	}
	public LoanAccount() 
	{
		
	}
	public String toString()
	{
		System.out.println("Loan Account Detail:");
		System.out.println("AccountNumber   Name of Customer   Loan Amount");

		return super.Accnum+"               "+super.name+"        "+super.bal;
	}

	/*
	 * public void widthrowmethod(float am) { System.out.println("Not ");
	 * System.out.println("widthrowal Amount. :"+am);
	 * System.out.println("Avaliable Baleance :"+super.bal); }
	 */
	public void calintarest()
	{
		
		System.out.println("Loan Account Interest is 6% par Month");
		System.out.println("Minimum Balence is:"+super.getBal());
		System.out.println("Total Dueration (in Month):");
		Scanner due = new Scanner(System.in);
		float time=due.nextFloat();
		float cint=((super.getBal()*interestrate*(time/12))/100);
		System.out.println("Intreset On Loan Account Amount :"+cint);
		System.out.println("Loan Account Total Interest is"+(cint+super.getBal()));
	}

	public void Diposit(float dm) 
	{
		super.bal=(super.bal+dm);
		System.out.println("Diposite Amount. :"+dm);
		System.out.println("Total Avaliable Baleance :"+super.bal);
	}
	
}
