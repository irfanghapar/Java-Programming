import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 5

public class Question_2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float a = 0, b = 0, c = 0;																//DECLARE THE VARIABLE FOR A, B, C
		double root1 = 0, root2 = 0;															// DECLARE THE ROOT 1 AND ROOT 2
			
		System.out.printf("Please enter value for a :  ");										// ASK USER TO ENTER THE VALUE FOR A
		a = scanner.nextFloat();																// SCAN THE VALUE
		System.out.printf("Please enter value for b :  ");										// ASK THE USER TO ENTER THE VALUE FOR B
		b = scanner.nextFloat();																// SCAN THE VALUE FOR B
		System.out.printf("Please enter value for c :  ");										// ASK THE USER TO ENTER THE VALUE FOR C
		c = scanner.nextFloat();																// SCAN THE VALUE FOR V
		
		double discriminant = (b*b) - (4*a*c);													// CALCULATE AND DECLARE THE DISCRIMINANT
		
		if(discriminant > 0) {																	//CONDITION IF DISCRIMINANT POSITIVE
			root1 = (-b - Math.pow(discriminant, 0.5)) / (2*a);									// CALCULATE ROOT 1
			root2 = (-b + Math.pow(discriminant, 0.5)) / 2*a;									// CALCULATE ROOT 2
			System.out.printf("The equation has two roots  " + root1 + "  and  " + root2);		// PRINT ROOT 1 AND ROOT 2
		} else if(discriminant < 0) {															// CONDTION FOR DISCRIMINANT LESS THAN 0
			System.out.printf("The equation has no real root");									// PRINT EQUATION HAS NO ROOT
		} else if(discriminant == 0) {															// CONDITION IF DISCRIMINANT EQUAL TO 0
			root1 = (-b - Math.pow(discriminant, 0.5)) / 2*a;									// CALCULATE ROOT 1
			System.out.printf("The equation has one root   " + root1);							// PRINT ROOT 1
		} else {
			System.out.printf("Print Error");													// PRINT ERROR 
		}
			
	}}

