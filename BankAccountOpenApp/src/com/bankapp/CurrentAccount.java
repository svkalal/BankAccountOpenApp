package com.bankapp;

public class CurrentAccount extends Account
{
	float overDraft;
	public CurrentAccount()
	{
		
	}
	
	public CurrentAccount(int idca, String nameca, float balca)
	{
		super(idca, nameca, balca);
	}
	
	public String toString() 
	{
		System.out.println("AccountNumber   Name of Customer   Balence   OverDraftAmount");
		return "CurrentAccount [ "+ Accnum +"       "+ name + "          "+ bal
				+ "           " + overDraft+"]";
	}

	public void widthrowmethod(float am) 
	{
		System.out.println("Available Balence is:"+super.bal);
		super.bal = (super.bal - am);
		if(am>super.bal)
		{
			super.bal = (super.bal - am);
			this.overDraft = Math.abs(super.bal);
		}
		System.out.println("widthrowal Amount. :"+am);
		System.out.println("Over Draft Baleance is:"+overDraft);
		
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
