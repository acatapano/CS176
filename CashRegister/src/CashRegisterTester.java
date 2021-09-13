import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) 
	{
		double product = 0;
		double amountPaid = 0;
		boolean done = true;
		
		Scanner in = new Scanner(System.in);
		
		CashRegister newCashRegister = new CashRegister();
		
		while(done = true)
		{
			
			System.out.println("Enter a purchase amount, or -1 to stop: ");
			product = in.nextDouble();
			
			if(product != -1)
			{
				
				newCashRegister.recordPurchase(product);
				
			}
			
			else
			{
				
				break;
				
			}
			
			product = 0;
			
		}
		
		System.out.println("Enter payment: ");
		amountPaid = in.nextDouble();
		newCashRegister.receivePayment(amountPaid);
		
		System.out.print("Your change is:\t");
		System.out.format("%.2f", newCashRegister.giveChange());
		
	}

}