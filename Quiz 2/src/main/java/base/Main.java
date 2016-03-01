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
	public static void main(String[] args) {
		
		Calculate_Tuition();
		
	}

	public static void Calculate_Tuition() {
		// Gather user input. Assuming a 4 year college experience.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your inititial tuition cost (per semester): ");
		float tuition = sc.nextFloat();
		System.out.println("Enter your percentage increases for tuition: ");
		float percent_inc = sc.nextFloat();
		System.out.println("Enter your APR: ");
		float APR = sc.nextFloat();
		System.out.println("Enter how long your repayment scheduel will be (in years): ");
		float Years = sc.nextFloat();
		sc.close();

		// Methods to gain total tuition cost.
		float total_tuition = Total_Cost(tuition, percent_inc, APR, Years);
		System.out.printf("$%,.2f%n", total_tuition);
		System.out.printf("$%,.2f%n", monthly_payment(total_tuition, Years));
	}

	// Obtain tuition with percentage increase factored and APR.
	public static float Total_Cost(float tuition, float percent_inc, float APR, float Years) {
		float final_tuition = 0;
		float APR_During = 0;
		float TOTAL = 0;
		//I am not sure if year one is supposed to have the percentage increase as well, but I've included it that way.
		for (int i = 0; i < 4; i++) {
			final_tuition += ((tuition * 2) + (tuition * (percent_inc/100))); 
			APR_During += final_tuition * (APR/100); //Calculate the APR value generated during each year @ school.
		}
		
		TOTAL = APR_During + final_tuition;
		
		// Calculate final cost of APR post college (if necessary).
		if(Years > 4){
			for (float i = Years-4; i > 0; i--) {
				TOTAL = TOTAL + (TOTAL * (APR/100));
			}
		}
		return TOTAL;
	}

	// Determine cost per month.
	public static float monthly_payment(float total, float repayment) {
		float monthly_payment = total / (repayment*12);
		return monthly_payment;
	}
}