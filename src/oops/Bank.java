package oops;

public class Bank {
	
	String name;
	int balance;
	Members mem;
	
	public int intrestgained(int increment)
	{
		balance=balance+increment;
		return balance;
		
	}
	public Members getBalance()
	{
		return mem;
	}

}
