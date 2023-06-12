package com.bankapp;

import java.util.Scanner;

public class SavingAccount extends Account
{
	 float interestrate=4;

	public float getInterestrate() {
		return interestrate;
	}
	public void setInterestrate(float interestrate) {
		this.interestrate = interestrate;
	}
	public SavingAccount() 
	{
		
	}
	public SavingAccount(int SAid,String SAname, float SAbal)
	{
		super(SAid,SAname,SAbal);
	}

	public String toString() 
	{
		System.out.println("AccountNumber   Name of Customer   Balence");
		return "SavingAccount [  " + Accnum + "          " + name + "           " + bal + "        " + interestrate+"]";
	}
	public void widthrowmethod(float am) 
	{
		super.bal=(super.bal-am);
		System.out.println("widthrowal Amount. :"+am);
		System.out.println("Avaliable Baleance :"+super.bal);
	}

	
	public void Diposit(float dm) 
	{
		super.bal=(super.bal+dm);
		System.out.println("Diposite Amount. :"+dm);
		System.out.println("Total Avaliable Baleance :"+super.bal);
	}
	public void calintarest()
	{
		System.out.println("Saving Account Interest is 4% par month");
		System.out.println("Minimum Balence is:"+super.getBal());
		System.out.println("Total Dueration (in Month):");
		Scanner due = new Scanner(System.in);
		float time=due.nextFloat();
		float cint=((super.getBal()*interestrate*(time/12))/100);
		System.out.println("Intreset On Saving Account Amount :"+cint);
		System.out.println("Saving Account Total Interest is"+(cint+super.getBal()));
	}
	
}
