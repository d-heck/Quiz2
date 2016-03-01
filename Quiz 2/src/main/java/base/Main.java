package base;

/*
 * I believe this code works as it should, I am not 100% on how we were
 * to calculate the data so I tried my best to reason with it. Hopefully
 * I have completed the question as it was meant to be.
 * 
 *  @David Heck
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Calculate_Tuition();
	}

	public static void Calculate_Tuition() 
	{
	// Gather user input. Assuming a 4 year college experience.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inititial tuition cost (per semester): ");
		double tuition = sc.nextDouble();
		System.out.println("Enter your percentage increases for tuition: ");
		double percent_inc = sc.nextDouble();
		System.out.println("Enter your APR: ");
		double APR = sc.nextDouble();
		System.out.println("Enter how long your repayment scheduel will be (in years): ");
		double Years = sc.nextDouble();
		sc.close();

		// Methods to gain total tuition cost.
		double total_tuition = Total_Cost(tuition, percent_inc);
		System.out.printf("$%,.2f%n", total_tuition);
		System.out.printf("$%,.2f%n", monthly_payment(total_tuition, APR, Years));
	}

	// Obtain total tuition cost with percentage increases each year.
	public static double Total_Cost(double tuition, double percent_inc) 
	{
		double Total = 0;
		for (int i = 0; i < 4; i++) 
		{
			Total += (tuition * 2) + (Math.pow(1 + (percent_inc/100), i)); //Multiply tuition by 2 since there are 2 semesters.
		}
		return Total;
	}

	// Calculate the cost of each month.
	public static double monthly_payment(double total_tuition, double APR, double years) 
	{
		double monthly_payment = (total_tuition * (Math.pow(1+(APR/100), years)))/(12*years);
		return monthly_payment;
	}
}