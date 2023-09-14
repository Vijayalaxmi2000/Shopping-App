package Account;

public class Account 
{
	public String accountHolderName;
	public long accountNo;
	public double bankbal=0.0;
	public String branch;
	public String iFSC;
	public String bankname;
	public Account(String accountHolderName, long accountNo, String branch, String iFSC, String bankname) 
	{
		
		this.accountHolderName = accountHolderName;
		this.accountNo = accountNo;
		this.branch = branch;
		this.iFSC = iFSC;
		this.bankname = bankname;
	}
	public void Deposite(double amt)
	{
		if(amt>0)
		{
			bankbal=bankbal+amt;
			System.out.println("deposited Bal:"+ bankbal);
		}
		else
		{
			System.out.println("Inavlid amount");
		}
	}
	public void withdraw(double amt)
	{
		if(bankbal>amt)
		{
			bankbal=bankbal-amt;
			System.out.println("Current bal"+bankbal);
		}
		else
		{
			System.out.println("Invalid balance");
		}
	}
	public void checkBal()
	{
		System.out.println("Current amount:"+bankbal);
	}

}
