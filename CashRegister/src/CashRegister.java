public class CashRegister 
{

	private double purchase;
	private double payment;
	
	public CashRegister()
	{
		  
	      purchase = 0;
	      payment = 0;
	      
	}
	
	public void recordPurchase(double product)
	{
		
		purchase = purchase + product;
		
	}
	
	public void receivePayment(double amountPaid)
	{
		
		payment = amountPaid;
		
	}
	
	public double giveChange()
	{
		
		return(payment - purchase);
		
	}

}