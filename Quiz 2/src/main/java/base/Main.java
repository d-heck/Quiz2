package base;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calculate_Tuition();
		
	}

	public static void Calculate_Tuition() {
		// Gather user input. Assuming a 4 year college experience.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inititial tuition cost (per semester): ");
		double tuition = sc.nextDouble();
		System.out.println("Enter your percentage increases for tuition: ");
		double percent_inc = sc.nextDouble() / 100;
		System.out.println("Enter your APR: ");
		double APR = sc.nextDouble() / 100;
		System.out.println("Enter how long your repayment scheduel will be (in years): ");
		int Years = sc.nextInt();
		sc.close();

		// Methods to gain total tuition cost.
		double total_tuition = Total_Cost(tuition, percent_inc, APR, Years);
		System.out.printf("$%,.2f%n", total_tuition);
		System.out.printf("$%,.2f%n", monthly_payment(total_tuition, Years));
	}

	// Obtain tuition with percentage increase factored and APR.
	public static double Total_Cost(double tuition, double percent_inc, double APR, int Years) {
		double final_tuition = 0;
		double APR_During = 0;
		double TOTAL = 0;
		//I am not sure if year one is supposed to have the percentage increase as well, but I've included it that way.
		for (int i = 0; i < 4; i++) {
			final_tuition += ((tuition * 2) + (tuition * percent_inc)); 
			APR_During += final_tuition * APR; //Calculate the APR value generated during each year @ school.
		}
		
		TOTAL = APR_During + final_tuition;
		
		// Calculate final cost of APR post college (if necessary).
		if(Years > 4){
			for (int i = Years-4; i > 0; i--) {
				TOTAL = TOTAL + (TOTAL * APR);
			}
		}
		return TOTAL;
	}

	// Determine cost per month.
	public static double monthly_payment(double total, int repayment) {
		double monthly_payment = total / repayment;
		return monthly_payment;
	}
}