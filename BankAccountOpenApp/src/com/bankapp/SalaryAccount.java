package com.bankapp;

public class SalaryAccount extends SavingAccount
{
	String Date;
	
	public SalaryAccount(int sid, String sname, float sbal) 
	{
		super(sid,sname,sbal);
		
	}
	public String toString()
	{
		System.out.println("Salary Account Detail:");
		System.out.println("AccountNumber   Name of Customer   Balence");

		return super.Accnum+"               "+super.name+"        "+super.bal;
	
	}
	
	
	public String getDate() {
		return Date;
	}
	public void setSalary(String Date) {
		this.Date = Date;
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
		
	}
}
