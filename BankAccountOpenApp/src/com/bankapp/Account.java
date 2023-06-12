package com.bankapp;

public abstract class Account 
{
	int Accnum;
	String name;
	float bal;
	
	public Account()
	{
		
	}
	public Account(int v1, String v2, float v3) 
	{
		Accnum=v1;
		name=v2;
		bal=v3;
	}
	public int getId() {
		return Accnum;
	}
	public void setId(int id) {
		this.Accnum = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	public abstract String toString();
	public abstract void widthrowmethod(float am);
	public abstract void Diposit(float dm);
	public abstract void calintarest();
	
	
}
