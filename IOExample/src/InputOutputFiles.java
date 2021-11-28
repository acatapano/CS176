import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFiles {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		String path = " ";
		boolean valid = false;
		PrintWriter outputFile;
		
		while(!valid)
		{
			
			System.out.println("Please enter the path to open the input file for example C:\\Downloads\\lines.txt :");
			path = in.nextLine();
			
			try
			{
				
				outputFile = new PrintWriter("C:\\Users\\acata\\Downloads\\outlines.txt");
				File inputFile = new File(path);
				Scanner input = new Scanner(inputFile);
				
				System.out.println("Path is valid. Enter the info you want to store. Stop the program to exit and save.");
				valid = true;
				while (in.hasNextLine()) 
				{
					
					String what = in.nextLine();
					outputFile.println(what);
					
				}
				
				in.close();
				outputFile.close();
				
			}
			
			catch(FileNotFoundException exception)
			{
				
				System.out.println("File is not found, please try again.");
				
			}
			
		}

	}

}
