import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);									// SCANNER TO SCAN FOR THE THE INPUT
		try { 
			System.out.printf("PLEASE ENTER THE NUMBER OF SIDES  : "); 				// USER INPUT THE NUMBER OF SIDES
			int n = scanner.nextInt();												// SCAN FOR INPUT EVERY COORDINATES
			System.out.printf("PLEASE ENTER THE LENGTH OF EACH SIDE  : "); 			// USER INPUT THE NUMBER OF SIDES
			double length = scanner.nextDouble();									// SCAN FOR INPUT EVERY COORDINATES
			double area = area(n, length);
			if (area > 0) {															// CONDITION FOR VALID EQUAL TO TRUE
				System.out.printf("THE AREA OF POLYGON IS %.2f", + area);
			} else {
				System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN\n");		// ELSE PRINT INVALID INPUT
				main(args);															// RETURN TO MAIN ARGUMENTS / METHOD
			}
	    }catch(InputMismatchException e) {
			System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN\n");		 	//catch exception if wrong input need to enter again
			main(args);
	    }
		}
		
		public static double area(int n, double length) { 							// METHOD TO CALCUALTE THE AREA
			double pi = 3.142;
			double area = (n * Math.pow(length,2))/(4 * Math.tan(pi/n));
			return area; 															// RETURN AREA VALUE
		}

	} 