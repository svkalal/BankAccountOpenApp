package com.bankapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bankapp.Excaptions.InvalidChoiceException;

public class MainApp {

	public static void main(String[] args) {

		List<Account> Acc = new ArrayList<Account>();

		Scanner intsc = new Scanner(System.in);
		Scanner Stringsc = new Scanner(System.in);
		Scanner folatsc = new Scanner(System.in);
		
		int ch = 0;
		MainApp app = new MainApp();
		app.problem();
		while (ch != 8) 
		{
			ch = app.execute();

			switch (ch) 
			{
			case 1: 
			{
				int accountchoice;
				System.out.println("Which Type Account is Open ?");
				System.out.println("1)Saving Account.");
				System.out.println("2)Current Account.");
				System.out.println("3)Salary Account.");
				System.out.println("4)Loan Account.");
				System.out.println("5)Back to Main-Menu.");
				Scanner scsc = new Scanner(System.in);
				accountchoice = scsc.nextInt();
				try
				{

					if (accountchoice < 1 || accountchoice > 6) {
						throw new InvalidChoiceException("Invaid Input Choice; Enter Agian");
				}

				} 
				catch (InvalidChoiceException ice) {
					System.out.println(ice.getMessage());
				}
				catch (InputMismatchException ime) {
					System.out.println("worng Data-type; Enter Again");
				}

				switch (accountchoice) 
				{
				case 1: 
				{
					int sid;
					String sname;
					float sbal=0;

					System.out.println("Enter Account Number(Parmanent Number):");
					sid = intsc.nextInt();

					System.out.println("Enter Name Account Holder:");
					sname = Stringsc.nextLine();

					while(sbal<1000) 
					{
						System.out.println("Enter Initial Amount Min-Balence 1000:");
						sbal = folatsc.nextFloat();
					}
					
					Acc.add(new SavingAccount(sid, sname, sbal));										
					System.out.println("Saving Account Succesfully Opened.");
				}
					break;
				case 2:
				{
					int sid;
					String sname;
					float sbal;

					System.out.println("Enter Account Number(Parmanent Number):");
					sid = intsc.nextInt();

					System.out.println("Enter Name Account Holder:");
					sname = Stringsc.nextLine();

					System.out.println("Enter Initial Amount:");
					sbal = folatsc.nextFloat();

					Acc.add(new CurrentAccount(sid, sname, sbal));

					System.out.println("Current Account Succesfully Opened.");
				}
					break;
				case 3: 
				{
					int sid;
					String sname;
					float sbal;

					System.out.println("Enter Account Number(Parmanent Number):");
					sid = intsc.nextInt();

					System.out.println("Enter Name Account Holder:");
					sname = Stringsc.nextLine();

					System.out.println("Enter Initial Amount:");
					sbal = folatsc.nextFloat();

					Acc.add(new SalaryAccount(sid, sname, sbal));

					System.out.println("Salary Account Succesfully Opened.");
				}
					break;
				case 4: 
				{

					int sid;
					String sname;
					float sbal;

					System.out.println("Enter Account Number(Parmanent Number):");
					sid = intsc.nextInt();

					System.out.println("Enter Name Account Holder:");
					sname = Stringsc.nextLine();

					System.out.println("Enter Loan (Demand Amount) Amount:");
					sbal = folatsc.nextFloat();

					Acc.add(new LoanAccount(sid, sname, sbal));
					

					System.out.println("Loan Account Succesfully Opened.");
				}
					break;
				case 5: 
				{
					System.out.println('\n');

				}
					break;
				default: 
				{
					System.out.println("Invalid Input For Acount Openning !!");
				}
					break;
				}

			}
				break;
			case 2: 
			{
				
				if(Acc.size()==0)
				{
					System.out.println(""+'\n'+"NO Any Account Record");
				}
				else 
				{
					for (Account a : Acc) 
					{
						System.out.println(a.toString());
					}
				}				
			}
			break;
			case 3: 
			{
				boolean flag = false;
				Iterator<Account> it = Acc.iterator();
				System.out.println("\nEnter Account Number For Removing Record.:");
				int accnum = intsc.nextInt();

				while (it.hasNext()) 
				{
					Account a = it.next();
					if (a.getId() == accnum) 
					{
						it.remove();
						flag = true;
						System.out.println("Record Successfully removed from Record.");

					}

					if (!flag) 
					{
						System.out.println("In Record (Account ID -" + accnum + ") Holder Not Found");
					}
					else 
					{
						System.out.println("Record Successfully removed from Record.");
					}
					 
				}
			}
				break;
			case 4: 
			{
				boolean flag = false;
				Iterator<Account> wacc = Acc.iterator();

				System.out.println("Welcome To Balance Widthrowl");
				System.out.println("Enter Account Number :");
				int wid = intsc.nextInt();

				while (wacc.hasNext()) 
				{
					Account a = wacc.next();
					if (a.getId() == wid ) {
						System.out.println("Enter Widthrow Amount:");
						float wam = folatsc.nextFloat();
						a.widthrowmethod(wam);
						flag = true;
					}
				}
				if (!flag) 
				{
					System.out.println("In Record (Account ID -" + wid + ") Holder Not Found");
				} 
				else 
				{
					System.out.println("Sucessfully Amount Widthrawal...");
				}

			}
				break;
			case 5: 
			{
				System.out.println("Welcome To Balance Diposite");
				System.out.println("Enter Account Number :");
				int did = intsc.nextInt();
				boolean flag = false;
				Iterator<Account> dacc = Acc.iterator();

				while (dacc.hasNext()) {
					Account a = dacc.next();
					if (a.getId() == did) {
						System.out.println("Enter Diposite Amount:");
						float dm = folatsc.nextFloat();
						a.Diposit(dm);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("In Record (Account ID -" + did + ") Holder Not Found");
				} else {
					System.out.println("Sucessfully Amount Diposite...");
				}

			}
				break;
			case 6: 
			{
				boolean flag = false;
				Iterator<Account> it = Acc.iterator();
				System.out.println("\nEnter Account Number For Upadate Record.:");
				int accno = intsc.nextInt();

				while (it.hasNext()) {
					Account a = it.next();
					if (a.getId() == accno) 
					{
						int c=0;
						while(c!=4)
						{
						System.out.println("chouse following one:");
						System.out.println("1.update Account Num.");
						System.out.println("2.update Account Name.");
						System.out.println("3.Back to Menu.");
						c=intsc.nextInt();
						switch(c)
						{
						case 1:
						{
							System.out.println("Enter New Account Numnber:");
							int nacc=intsc.nextInt();
							a.setId(nacc);
							
						}
						break;
						case 2:
						{
							System.out.println("Enter new Name:");
							String nname=Stringsc.nextLine();
							a.setName(nname);
						}
						break;
						case 3:
						{
							System.out.println("Back to Update Menu.");
						}
						break;
						default:
							System.out.println("Invalid choice.");
							break;
						}

						}
						flag = true;

						
					}
					}
					if (!flag) 
					{
						System.out.println("In Record (Account ID -" + accno + ") Holder Not Found");
					}
					 else 
					 {
						 System.out.println("Record Successfully Updated."); 
					 }
			}
				break;
			case 7: 
			{
				Iterator<Account> ia = Acc.iterator();
				System.out.println("Enter Account Number for Calculate Intrest :");
				int i=intsc.nextInt();
				boolean flagg=false;
				while(ia.hasNext())
				{
					Account Ai=ia.next();
					if(Ai.getId() ==i)
					{
						Ai.calintarest();
						flagg=true;
					}
				}
				if (!flagg)
				{
					System.out.println("In Record (Account ID -" + i + ") Holder Not Found");
				} 
				/*
					 * else { System.out.println("Sucessfully Amount Diposite..."); }
					 */
			}
			break;
			case 8:
				System.out.println("========>> Thank You Visit Again <=========");
				break;
			default:
				System.out.println("====Invalid Input Choice");
				break;
			}
		}
	}

	public int execute() {

		int choice;

		choice = acceptchoice();
		System.out.println(choice);

		return choice;

	}

	public int acceptchoice() {
		Scanner integersc = new Scanner(System.in);
		int choice = 0;
		boolean flag = false;
		while (flag == false) {

			try {
				System.out.println("");
				System.out.println("=============================");
				System.out.println("| Select any one Following. |");
				System.out.println("| 1) Account Opening        |");
				System.out.println("| 2) Show Account Detail.   |");
				System.out.println("| 3) Account Closeing       |");
				System.out.println("| 4) Withdrow               |");
				System.out.println("| 5) Diposit                |");
				System.out.println("| 6) Update Record          |");
				System.out.println("| 7) Calculate Interest.    |");
				System.out.println("| 8) Exit.                  |");
				System.out.println(" ---------------------------");
				
				choice = integersc.nextInt();

				flag = true;
				if (choice < 1 || choice > 8) {
					throw new InvalidChoiceException("Invaid Input Choice; Enter Agian");
				}

			} catch (InvalidChoiceException ice) {
				System.out.println(ice.getMessage());
			} catch (InputMismatchException ime) {
				System.out.println("worng Data-type; Enter Again");
				break;
			}

		}

		return choice;

	}

	public void problem() {
		System.out.println("");
		System.out.println("====================================");
		System.out.println("|    BOI Bank Application          |");
		System.out.println("| Help You to Open/Close Accounts  |");
		System.out.println("====================================");
	}

}
