
import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 2

public class LabAsessmentQ1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double amount;  // delcare the amount
		double AmountToPay; //declare the variable for AmountToPay (positive)
		
		System.out.printf("Please enter your item amount : RM");  // input the amount of for customer 
		amount = scanner.nextDouble();
		
		if ((amount > 0) && (amount < 150))  {
			AmountToPay = amount - (amount * 5/100); //discount for 5 %
			System.out.println("\nThe amount customer need to pay after discount is : RM" + AmountToPay); // print for the amount customer need to pay

		} else if ((amount >= 150) && (amount < 600)) {
			AmountToPay = amount - (amount * 10/100); //discount for 10 %
			System.out.println("\nThe amount customer need to pay after discount is : RM" + AmountToPay); // print for the amount customer need to pay

		} else if (amount >= 600) {
			AmountToPay = amount - (amount * 15/100); //discount for 15 %
			System.out.println("\nThe amount customer need to pay after discount is : RM" + AmountToPay); // print for the amount customer need to pay
		
		} else 
			System.out.println("\nThe amount must be positive"); // print for the amount customer need to pay
		
}
}
