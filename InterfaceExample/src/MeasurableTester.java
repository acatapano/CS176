/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
	   
	  //Country
	  System.out.println("Countries:");
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg = Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      
      double maxCountry = Data.max(countries);
      System.out.println("Maximum area: " + maxCountry);
      System.out.println("Expected: 513120\n");
      
      //BankAccount
      System.out.println("Bank Accounts:");
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(176220);
      accounts[1] = new BankAccount(513120);
      accounts[2] = new BankAccount(30510);
      double avgB = Data.average(accounts);
      System.out.println("Average balance: " + avgB);
      System.out.println("Expected: 239950");
      
      double maxBalance = Data.max(accounts);
      System.out.println("Max balance: " + maxBalance);
      System.out.println("Expected: 513120\n");
      
      //Quiz
      System.out.println("Quizzes:");
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95);
      quizzes[1] = new Quiz(80);
      quizzes[2] = new Quiz(90);
      quizzes[3] = new Quiz(50);
      quizzes[4] = new Quiz(75);
      double avgS = Data.average(quizzes);
      System.out.println("Average score: " + avgS);
      System.out.println("Expected: 78");
      
      double maxScore = Data.max(quizzes);
      System.out.println("Max score: " + maxScore);
      System.out.println("Expected: 95");
      
   }
}
