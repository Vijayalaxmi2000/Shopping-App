package Utilization;

import Account.Account;
import DebitCard.CreditCard;
import DebitCard.DebitCard;
import DebitCard.ModeOfPayment;
import ShoppingApp.ShoppingApp;

public class MainApp {

	public static void main(String[] args) 
	{
		System.out.println("Account Details------------------------");
		Account a1=new Account("Vijayalaxmi",121212012,"Hanuman Nagar","cnrb123","Canara Bank" );
		a1.Deposite(20000.0);
		a1.checkBal();
		System.out.println("");
		System.out.println("");
		System.out.println("DebitCard details-------------------");
		
		DebitCard d1=new DebitCard(1234, 183, "03/23", a1);
		d1.showdetails();
		d1.generatePin(1234);
		d1.updatedetails(1083, "03/23");
		System.out.println("");
		System.out.println("");
		System.out.println("CreditCard Details-------------------");
		
		System.out.println("");
		System.out.println("");
		
        CreditCard c1=new CreditCard(145, "03/25", a1);
        c1.payAmtToCredit(5000.0);
        c1.checkBal();
        ModeOfPayment m1=new ModeOfPayment(a1, 1455);
        m1.onlinePayment(10000.0, 1455, c1);
        c1.checkBal();
        m1.onlinePayment(18000.0, 1455, d1);
        a1.checkBal();
        System.out.println("");
        System.out.println("");
        
	    System.out.println("ShoppingApp Details--------------");
	    
	    
		ShoppingApp s1=new ShoppingApp(a1, "oneplus", 1000.0,"#848 Sahyadri Nagar Belagavi");
		s1.showShoppingdetails();
		s1.selectProduct("onePlus", 1000.0, "#848 Sahyadri Nagar Belagavi");
		d1.onlinePayment(1000.0, 1234);
		a1.checkBal();	
		}

}
