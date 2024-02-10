import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 5

public class Question_3{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int amount = 0;																				// DECLARE AMOUNT
		int fiftybills = 0, twentybills = 0, tenbills = 0, fivebills = 0, onebills = 0;				// DELCARE FIFTY, TWENTY, TEN, FIVE, ONE BILLS
		
		System.out.printf("Please enter Malaysia Ringgit amount :  ");								// ASK USER TO ENTER THE MALAYSIA RINGGIT AMOUNT
		amount = scanner.nextInt();																	// GET THE INPUT FROM THE USER
		
		fiftybills = amount / 50;																	// CALCULATE THE TOTAL BILLS FOR 50
		amount = amount % 50;																		// CALCULATE THE REMAINDER OR BALANCE 
		twentybills = amount / 20;																	// CALCULATE THE TOTAL BILLS FOR 20
		amount = amount % 20;																		// CALCULATE THE REMAINDER OR BALANCE 
		tenbills = amount / 10;																		// CALCULATE THE TOTAL BILLS FOR 10
		amount = amount % 10;																		// CALCULATE THE REMAINDER OR BALANCE 
		fivebills = amount / 5;																		// CALCULATE THE TOTAL BILLS FOR 5
		amount = amount % 5;																		// CALCULATE THE REMAINDER OR BALANCE 
		onebills = amount / 1;																		// CALCULATE THE TOTAL BILLS FOR 1
		
		System.out.printf("\nNumber of RM50 bills : " + fiftybills);								// PRINT THE NUMBER OF FIFTY BILLS
		System.out.printf("\nNumber of RM20 bills : " + twentybills);								// PRINT THE NUMBER OF TWENTY BILLS
		System.out.printf("\nNumber of RM10 bills : " + tenbills);									// PRINT THE NUMBER OF TEN BILLS
		System.out.printf("\nNumber of RM5 bills  : " + fivebills);									// PRINT THE NUMBER OF FIVE BILLS
		System.out.printf("\nNumber of RM1 bills  : " + onebills);									// PRINT THE NUMBER OF ONE BILLS

	}}
