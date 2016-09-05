import java.util.Scanner;

public class Exercise2_20 {

	  public static void main(String[] Strings) {


	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
	        double balance = input.nextDouble();
	        double annualInterestRate = input.nextDouble() / 100;

	        double interest = balance * (annualInterestRate / 12);

	        System.out.print("The interest is " + interest);

	    }
	}
	


