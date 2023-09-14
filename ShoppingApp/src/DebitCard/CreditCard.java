package DebitCard;

import Account.Account;
import ShoppingApp.ShoppingApp;

public class CreditCard 
{
	double creditBal=40000.0;
	double bal;
	DebitCard d1;
	ShoppingApp s1;
	Account a1;
	int cvv;
	String expDate;
	
   public CreditCard(int cvv,String expDate,Account a1 ) 
   {
		super();
		this.cvv=cvv;
		this.expDate=expDate;
		this.a1=a1;
		
	}

   public void payAmtToCredit(double pay)
   {
	   if(creditBal>pay)
	   {
		   creditBal=creditBal-pay;
		   System.out.println("Current Bal:"+creditBal);
	   }
   }
   public void checkBal()
   {
	   System.out.println("Current credit Bal:"+creditBal);
   }



	

}
