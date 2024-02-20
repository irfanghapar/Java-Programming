import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);	// SCANNER TO SCAN FOR THE THE INPUT
		try { 
			System.out.printf("PLEASE ENTER THE COORDINATES SEPARATED BY SPACES : "); // USER INPUT THE COORDINATES
			double x1 = scanner.nextDouble();	// SCAN FOR INPUT EVERY COORDINATES
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			double x3 = scanner.nextDouble();
			double y3 = scanner.nextDouble();
			
			double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5); // CALCULATION FOR SIDE 1, 2, 3
			double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
			double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
			
			boolean valid = isValid(side1, side2, side3); 		// CALLING BOOLEAN VALUE FOR VALID
			double area = area(side1, side2, side3);			// CALLING AREA METHOD FOR SIDE 1 2 AND 3 
			if (valid == true) {								// CONDITION FOR VALID EQUAL TO TRUE
				System.out.printf("THE AREA OF TRIANGLE IS %.2f", + area);
			} else {
				System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN\n");	// ELSE PRINT INVALID INPUT
				main(args);														// RETURN TO MAIN ARGUMENTS / METHOD
			}
	    }catch(InputMismatchException e) {
			System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN\n"); //catch exception if wrong input need to enter again
			main(args);
	    }
		}
		public static boolean isValid(double side1, double side2, double side3) { //METHOD FOR BOOELAN IS VALID
			
			boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1; // CONDITION TO ENSURE THE VALUE IS VALID
			return valid;
		}
		public static double area(double side1, double side2, double side3) { // METHOD TO CALCUALTE THE AREA
			
			double s = (side1 + side2 + side3) / 2;				// CALCULATE S
			double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // CALCULATE AREA
			return area; // RETURN AREA VALUE
		}

	} //1.5 -3.4 4.6 5 9.5 -3.4

