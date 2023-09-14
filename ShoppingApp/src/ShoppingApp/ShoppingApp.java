package ShoppingApp;

import Account.Account;
import DebitCard.DebitCard;

public class ShoppingApp 
{
	public String productName;
	public double productPrice;
	public String shippingAddress;
	DebitCard d;
	Account a1;
	public ShoppingApp( Account a1, String productName, double productPrice, String shippingAddress) 
	{
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.shippingAddress = shippingAddress;
	}
	public void showShoppingdetails()
	{
		System.out.println("productName: "+productName+",productPrice:"+productPrice+",shippingAddress:"+shippingAddress);
	}
	public void selectProduct(String productName,double productPrice,String shippingAddress)
	{
		if(this.productName==productName && this.productPrice==productPrice && this.shippingAddress==shippingAddress);
		{
			System.out.println("product is selected buy now");
		}
		
	}

}
