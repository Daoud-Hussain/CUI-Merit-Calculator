//Java Program to check merit of COMSATS University Islamabad.

import java.util.Scanner;
public class merit{
    public static void main(String[] args) {

        // Creating Object for Input
    	Scanner select = new Scanner(System.in);
    	System.out.print("Enter '1' for Result awaiting and '2' for result declared candidates: ");
        int choice = select.nextInt();
        // condition for both types of candidates
        if (choice == 1){
            // Creating Object for Input
        	Scanner input = new Scanner(System.in);

      	// Taking Inputs from user
        	System.out.print("Enter your Matric Marks: ");
        	float matricMarks = input.nextFloat();
        	System.out.print("Enter your NTS Marks: ");
        	float ntsMarks = input.nextFloat();

        // Calculating Percentage
        	float matricPercentage = (matricMarks/1100)*100;
        	float ntsPercentage = (ntsMarks/100)*100;

        // Calculating Merit According to the scheme 50% Matric and 50% NTS
        	double meritCUI = ((matricPercentage*0.5)+(ntsPercentage*0.5));

        	System.out.printf("Your Aggregate is: %5.2f", meritCUI);
        }
    	else if (choice == 2){
    	// Creating Object for Input
        	Scanner input = new Scanner(System.in);

      	// Taking Inputs from user
        	System.out.print("Enter your Matric Marks: ");
        	float matricMarks = input.nextFloat();
        	System.out.print("Enter your Inter Marks: ");
        	float interMarks = input.nextFloat();
        	System.out.print("Enter your NTS Marks: ");
        	float ntsMarks = input.nextFloat();

        // Calculating Percentage
        	float matricPercentage = (matricMarks/1100)*100;
        	float interPercentage = (interMarks/1100)*100;
        	float ntsPercentage = (ntsMarks/100)*100;

        // Calculating Merit According to the scheme 10% Matric, 40% Inter and 50% NTS
        	double meritCUI = ((matricPercentage*0.1)+(interPercentage*0.4)+(ntsPercentage*0.5));

        	System.out.printf("Your Aggregate is: %5.2f", meritCUI);
    	}
    	else{
    		System.out.println("Invalid choice. Try Again! ");
    	}
    }
}
