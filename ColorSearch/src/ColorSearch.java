import java.util.Scanner;
import java.util.ArrayList;

public class ColorSearch 
{
	public void SearchColor(ArrayList<String> Colors, String searchColor)
	{
		
		boolean found = false;
		
		for (String color : Colors)
		{
			
			if (searchColor.compareTo(color) == 0)
			{
				
				found = true;
				break;
				
			}
			
		}
		
		if (found)
		{
			
			System.out.println("The color " + searchColor + " was found after " + (Colors.indexOf(searchColor) + 1) + " searches.\n");
			
		}
		
		else if (!found)
		{
			
			System.out.println("The color " + searchColor + " was not found after " + Colors.size() + " searches.\n");
			
		}
		
	}
	
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		ColorSearch cSearch = new ColorSearch();
		ArrayList<String> Colors = new ArrayList<String>();
		String color;
		String searchColor;
				
		System.out.println("Enter a color name, or \"Q\" to quit: ");
		
		while(in.hasNext())
		{
			
			color = in.nextLine();
			
			if(color.compareTo("Q") == 0)
			{
				
				break;
				
			}
			
			else
			{
				
				Colors.add(color);
				
			}
			
			System.out.println("Enter a color name, or \"Q\" to quit: ");
			
		}
		
		System.out.println("\nEnter a color to search for, or \"Q\" to quit: ");
		
		while(in.hasNext())
		{
			
			searchColor = in.nextLine();
			
			if(searchColor.compareTo("Q") == 0)
			{
				
				break;
				
			}
			
			else
			{
				
				cSearch.SearchColor(Colors, searchColor);
				
			}
			
			System.out.println("Enter a color to search for, or \"Q\" to quit: ");
			
		}
		
	}

}