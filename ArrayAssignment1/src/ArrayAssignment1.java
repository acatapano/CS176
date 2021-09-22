
public class ArrayAssignment1 {

	public static void main(String[] args) 
	{
		
		double values[] = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double maximum = 0;
		int negativeCount = 0;
		
		/*
		Normal For Loop:
		for(int i = 0; i < values.length; i++)
		{
			
			System.out.print(values[i] + " ");
			
			if(values[i] < 0)
			{
				
				negativeCount = negativeCount + 1;
				
			}
			
			if(values[i] > maximum)
			{
				
				maximum = values[i];
				
			}
			
		}*/
		
		//Enhanced For Loop:
		for(double element : values)
		{

			System.out.print(element + " ");
			
			if(element < 0)
			{
				
				negativeCount = negativeCount + 1;
				
			}
			
			if(element > maximum)
			{
				
				maximum = element;
				
			}
			
		}
		
		System.out.println("\n");
		System.out.println("The maximum number in the array is: " +  maximum);
		System.out.println("There are " + negativeCount + " negative numbers in the array.");
		

	}

}
