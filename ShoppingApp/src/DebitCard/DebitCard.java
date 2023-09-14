package DebitCard;

import Account.Account;

public class DebitCard 
{
	public int pinNumber;
	public int cvv;
	public String expDate;
	public Account a1;
  
	public DebitCard(int pinNumber, int cvv, String expDate, Account a1) 
	{
		
		this.pinNumber = pinNumber;
		this.cvv = cvv;
		this.expDate = expDate;
		this.a1 = a1;
	}
	public void showdetails()
	{
		System.out.println("pinNmuber:"+pinNumber+" cvv:" +cvv+" expDate:" +expDate );
		
	}
	public void generatePin(int pinNumber)
	{
		this.pinNumber=pinNumber;
	}
	public void updatedetails(int cvv,String expDate)
	{
		this.cvv=cvv;
		this.expDate=expDate;
	}
	public void onlinePayment(double productAmount,int pinNumber)
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
	

}
