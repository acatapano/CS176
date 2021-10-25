/**
   Reimplement the CheckingAccount class below so that the
   first withdrawal is free but each additional withdrawal during a month incurs $20 fee.

Add code below to make CheckingAccount a subclass of BankAccount
*/

public class CheckingAccount extends BankAccount
{

/**
Add an instance variable below that keeps track of the number of withdrawals each month
*/   
	private int monthlyWithdrawals;

   /**
      Constructs a checking account with a zero balance. Set withdrawals to 0 as well
   */
	
   public CheckingAccount()
   {
	   
	   // Since it's a BankAccount, the balance is automatically set to 0 w/the constructor
	   monthlyWithdrawals = 0;
	   
   }

   /**
      Add code below. If more than 1 withdrawal in month. Withdraw an extra 20 from BankAccount balance
   */
   
   public void withdraw(double amount)
   {

	   if (monthlyWithdrawals > 1)
	   {
		   
		   super.withdraw(amount + 20);
		   monthlyWithdrawals++;
		   
	   }
	   
	   else
	   {
		   
		   super.withdraw(amount);
		   monthlyWithdrawals++;
		   
	   }
	   
   }

   /**
      Add code to End of month procedure to reset number of withdrawals to 0 
   */
   
   public void monthEnd()
   {

	   monthlyWithdrawals = 0;
	   
   }
   
}

