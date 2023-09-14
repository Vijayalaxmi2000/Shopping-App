package DebitCard;

import Account.Account;

public class ModeOfPayment 
{
	Account a1;
	public int pinNumber;
	
	public ModeOfPayment(Account a1, int pinNumber) 
	{
		super();
		this.a1 = a1;
		this.pinNumber = pinNumber;
	}


	public void onlinePayment(double productAmount,int pinNumber,DebitCard d1)
	{
			if(this.pinNumber==pinNumber)
			{
				if(a1.bankbal>productAmount)
				{
					a1.bankbal=a1.bankbal-productAmount;
					System.out.println("payment successfull and order placed");
				}
				else
				{
					System.out.println("insufficient BAlance");
				}
			}
			else
			{
				System.out.println("Invalid pinNumber");
			}
	}
		

	public void onlinePayment(double productAmount,int pinNumber,CreditCard c1)
	{

		if(this.pinNumber==pinNumber)
		{
			if(c1.creditBal>productAmount)
			{
				c1.creditBal=c1.creditBal-productAmount;
				System.out.println("payment successfull and order placed");
			}
			else
			{
				System.out.println("insufficient BAlance");
			}
		}
		else
		{
			System.out.println("Invalid pinNumber");
		}
	}
	

}
