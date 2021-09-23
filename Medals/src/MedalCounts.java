
public class MedalCounts {

	public static void main(String[] args) 
	{

		final int COUNTRIES = 8;
		final int MEDALS = 3;
		int[][] counts = {{ 0, 3, 0}, { 0, 0, 1}, { 0, 0, 1}, { 1, 0, 0}, { 0, 0, 1}, { 3, 1, 1}, { 0, 1, 0}, { 1, 0, 1}};
		String[] countries = {"Canada", "Italy",  "Germany",  "Japan",  "Kazakhstan",  "Russia",  "South Korea",  "United States"};
		int medalSum = 0;
		int totalMedals = 0;
		
		System.out.println("      Country    Gold  Silver  Bronze   Total");
		
		for (int i = 0; i < COUNTRIES; i++)
		{
			
			System.out.printf("%13s", countries[i]);
			
			for (int j = 0; j < MEDALS; j++)
			{  
				
				System.out.printf("%8d", counts[i][j]);
				medalSum = medalSum + counts[i][j];
				
			}
			
			System.out.printf("%8d", medalSum);
			medalSum = 0;
			System.out.println(); 
			
		}
		
		System.out.printf("%13s", "Total");
		
		for (int j = 0; j < MEDALS; j++)
		{
			
			for (int i = 0; i < COUNTRIES; i++)
			{
				
				medalSum = medalSum + counts[i][j];
				
			}
			
			System.out.printf("%8d", medalSum);
			totalMedals = totalMedals + medalSum;
			medalSum = 0;
			
		}
		
		System.out.printf("%8d", totalMedals);
		
	}
}
