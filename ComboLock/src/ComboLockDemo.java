import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		boolean open = false;
		ComboLock lock = new ComboLock(30, 20, 10);
		
		while (!open)
		{
			
			System.out.println("Enter the number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int right1 = in.nextInt();
			
			if (right1 > 39 || right1 < 0)
			{
				
				break;
				
			}
			
			else if (right1 < 39 && right1 > 0)
			{
				
				lock.turnRight(right1);
				
			}
			
			System.out.println("Enter the number of ticks to turn to the left 0 - 39. Enter an invalid number to quit.");
			int left = in.nextInt();
			
			if (left > 39 || left < 0)
			{
				
				break;
				
			}
			
			else if (left < 39 && left > 0)
			{
				
				lock.turnLeft(left);
				
			}
			
			System.out.println("Enter the number of ticks to turn to the right 0 - 39. Enter an invalid number to quit.");
			int right2 = in.nextInt();
			
			if (right2 > 39 || right2 < 0)
			{
				
				break;
				
			}
			
			else if (right2 < 39 && right2 > 0)
			{
				
				lock.turnRight(right2);
				
			}
			
			open = lock.open();
			
			if (!open)
			{
				
				System.out.println("You did not open the lock! Would you like to try again? ('Yes' to continue or 'No' to quit)");
				String answer = in.next();
				boolean valid = false;
				
				while (!valid)
				{
					
					if (answer.compareTo("Yes") == 0 || answer.compareTo("No") == 0)
					{
						
						valid = true;
						
					}
					
					else
					{
						
						System.out.println("Invalid answer. Please enter 'Yes' or 'No'.");
						answer = in.next();
						
					}

				}
				
				if (answer.compareTo("Yes") == 0)
				{
					
					lock.reset();
					System.out.println();
					
				}
				
				else if (answer.compareTo("No") == 0)
				{
					
					break;
					
				}
				
			}
			
		}
		
		if (open)
		{
			
			System.out.println("You opened the lock!");	
			
		}

	}

}
