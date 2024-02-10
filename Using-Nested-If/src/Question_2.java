
import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 2

public class LabAssesmentQ2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String PackageType; 																			 // Declare string for PackageType
		double MinutesUsed, TotalCharges = 0, AddMinutes = 0, AddMinutesCharges = 0, InitialMinutes = 0; //Declare the variable for minutes used, Total charges, AddminutesCharges, InitalMinutes (positive)
		double InitialCharges = 0; 																		// Declare InitalCharges
			
		System.out.printf("Enter the following details : \n");									// print the following details
		System.out.printf("\nPackage Type (Gold / Platinum / Titanium)                : ");   	// input the type of package for mobile plans 
		PackageType = scanner.nextLine();														// reads the string input for package type
		
		System.out.printf("Minutes used                                             : ");     // input the minutes used  
		MinutesUsed = scanner.nextDouble();							// reads the input for minutes used

		if (PackageType.equals("Gold"))  {							// Statement for package type = gold
			InitialMinutes = 450;									// Minutes for gold plans
			InitialCharges = 80;									// Charges for gold plan
			AddMinutes = MinutesUsed - InitialMinutes; 				// Calculate the Added Minutes
			AddMinutesCharges = (AddMinutes * 0.40); 				// Calculate the Charges for Added Minutes
			TotalCharges = AddMinutesCharges + InitialCharges;		// Calculate the Total Charges
			
				if (MinutesUsed < InitialMinutes)	{				// Statement if minutes used less than the initial minutes
					AddMinutes = 0;									// Added Minutes = 0
					AddMinutesCharges = 0;							// Charges for added minutes = 0
					TotalCharges = InitialCharges;					// Total Charges = Initial Charges
				}
				
		} else if (PackageType.equals("Platinum"))  {				// Statement for package type = Platinum
			InitialMinutes = 900;									// Minutes for Platinum plans
			InitialCharges = 120;									// Charges for Platinum plan
			AddMinutes = MinutesUsed - InitialMinutes; 				// Calculate the Added Minutes
			AddMinutesCharges = (AddMinutes * 0.20); 				// Calculate the Charges for Added Minutes
			TotalCharges = AddMinutesCharges + InitialCharges;		// Calculate the Total Charges
			
				if (MinutesUsed < InitialMinutes)	{				// Statement if minutes used less than the initial minutes
				AddMinutes = 0;										// Added Minutes = 0
				AddMinutesCharges = 0;								// Charges for added minutes = 0
				TotalCharges = InitialCharges;						// Total Charges = Initial Charges
			}

		} else if (PackageType.equals("Titanium")) {				// Statement for package type = Titanium
			TotalCharges = 160;										// Total Charges = 160 (for Titanium plan)
			InitialMinutes = 0;										// unlimited Minutes
				
		} else {
			System.out.println("\nError, you need to enter again"); // Print error if user input is wrong
		}
		
		System.out.printf("\n\t<<Bil description>>\n");												// Print the Bill Description
		System.out.printf("\nPackage                  :  " + PackageType+"\n");
		System.out.printf("\n" + InitialMinutes + " minutes            :  RM"+InitialCharges);		// Print the initial Minutes and Initial Charges
		System.out.printf("\n"+ AddMinutes + " added minutes       :  RM" + AddMinutesCharges);		// Print the added minutes and Charges for added minutes
		System.out.printf("\nTotal Charges            :  RM" + TotalCharges);						// Print the total charges
	}
}

