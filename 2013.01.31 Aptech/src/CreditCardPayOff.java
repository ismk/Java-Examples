import java.util.Scanner;

public class CreditCardPayOff 
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		
		double monthlyPayment = 0;
		double annualInterestRate = 0;
		double principal = 0;
		
		System.out.println("Please enter your desired monthly payment:   "); //in dollars
		monthlyPayment = keyboard.nextDouble();
		
		System.out.println("Please enter your annual interest rate:   "); //in percent (decimal!)
		annualInterestRate = keyboard.nextDouble();
		
		System.out.println("Please enter the principal amount owed:   "); //in dollars
		principal = keyboard.nextDouble();
		
		double monthsToPay = (Math.log(monthlyPayment) - Math.log(monthlyPayment - ((annualInterestRate/100)/1200.0) * principal)/(Math.log((annualInterestRate/100)/1200.0)+1.0));
		int monthsToPayInt = (int)Math.ceil(monthsToPay);
		
		double totalPaid = (monthlyPayment * monthsToPayInt);
		double interestPaid = (totalPaid - principal);
		
		// Overpayment is equal to the total amount paid (monthsToPay * monthlyPayment) minus 
		// the total amount owed (principal * annualInterestRate)
		double overpayment = (monthsToPay * monthlyPayment)-(principal * annualInterestRate);
		
		System.out.println("Principal: \t \t" + principal);
		System.out.println("Annual Interest Rate (%): \t" + annualInterestRate);
		System.out.println("Monthly Payment: \t" + monthlyPayment);
		System.out.println("");
		
		System.out.println("Months Need To Pay Off: \t" + monthsToPayInt);
		System.out.println("Total Amount Paid: \t \t $" + totalPaid);
		System.out.println("Total Interest Paid: \t \t $" + interestPaid);
		System.out.println("Overpayment: \t \t \t $" + overpayment);
		
		
	}

}