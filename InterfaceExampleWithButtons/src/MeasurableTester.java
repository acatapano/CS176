import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{

	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 135;

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		
		//Country
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		
		//BankAccount
		Measurable[] accounts = new Measurable[3];
		accounts[0] = new BankAccount(176220);
		accounts[1] = new BankAccount(513120);
		accounts[2] = new BankAccount(30510);

		//Quiz
		Measurable[] quizzes = new Measurable[5];
		quizzes[0] = new Quiz(95);
		quizzes[1] = new Quiz(80);
		quizzes[2] = new Quiz(90);
		quizzes[3] = new Quiz(50);
		quizzes[4] = new Quiz(75);

		System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		int whichMetric = in.nextInt();
		String metric;
		if(whichMetric == 1)
		{
			
			metric = "Maximum";
			
		}
		
		else if(whichMetric == 2)
		{
			
			metric = "Minimum";
			
		}
		
		else
		{
			
			metric = "Average";
			
		}

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		JButton bankB = new JButton("Get " + metric + " Balance");
		panel.add(bankB);
		ActionListener listener = new MeasurableListener(accounts, metric);
		bankB.addActionListener(listener);
		
		JButton countryB = new JButton("Get " + metric + " Area");
		panel.add(countryB);
		ActionListener listener2 = new MeasurableListener(countries, metric);
		countryB.addActionListener(listener2);

		JButton quizB = new JButton("Get " + metric + " Score");
		panel.add(quizB);
		ActionListener listener3 = new MeasurableListener(quizzes, metric);
		quizB.addActionListener(listener3);
		
		frame.add(panel);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
