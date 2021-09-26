import java.util.Scanner;
public class merit{
    public static void main(String[] args) {

        // Creating Object for Input
    	Scanner select = new Scanner(System.in);
    	System.out.print("Enter '1' for Result awaiting and '2' for result declared candidates: ");
        int choice = select.nextInt();
        // condition for both types of candidates
        if (choice == 1){
        	Scanner obj = new Scanner(System.in);

      	// Taking Inputs from user
        	System.out.print("Enter your Matric Marks: ");
        	float matric = obj.nextFloat();
        	System.out.print("Enter your NTS Marks: ");
        	float nts = obj.nextFloat();

        // Calculating Percentage
        	float matric_percentage = (matric/1100)*100;
        	float nts_percentage = (nts/100)*100;

        // Calculating Merit According to the scheme 50% Matric and 50% NTS
        	double merit_cui = ((matric_percentage*0.5)+(nts_percentage*0.5));

        	System.out.println("Your merit is :"+ merit_cui);
        }
    	else if (choice == 2){
    	// Creating Object for Input
        	Scanner obj = new Scanner(System.in);

        // Taking Inputs from user
        	System.out.print("Enter your Matric Marks: ");
        	float matric = obj.nextFloat();
        	System.out.print("Enter your Inter Marks: ");
        	float inter = obj.nextFloat();
        	System.out.print("Enter your NTS Marks: ");
        	float nts = obj.nextFloat();

        // Calculating Percentage
        	float matric_percentage = (matric/1100)*100;
        	float inter_percentage = (inter/1100)*100;
        	float nts_percentage = (nts/100)*100;

        // Calculating Merit According to the scheme 10% Matric, 40% Inter and 50% NTS
        	double merit_cui = ((matric_percentage*0.1)+(inter_percentage*0.4)+(nts_percentage*0.5));

        	System.out.println("Your merit is :"+ merit_cui);
    	}
    	else{
    		System.out.println("Invalid choice. Try Again! ");
    	}
    }
}