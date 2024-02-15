// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 6

import java.util.Scanner;
import java.util.InputMismatchException;


public class Question_1 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);  
    
    double CashDeposit = 0, AnnualYield = 0, months = 0, CDValue = 0;
    
    try {
    do {
    	System.out.print("\n\nENTER INITIAL DEPOSIT AMOUNT		: ");	//USER INPUT DEPOSIT AMOUNT
    	CashDeposit = scanner.nextDouble();
    	System.out.print("ENTER ANNUAL PERCENT YIELD		: ");		//USER INPUT ANNUAL PERCENT YIELD
    	AnnualYield = scanner.nextDouble();
    	System.out.print("ENTER MATURITY PERIOD (NO OF MONTHS)	:  ");	//USER INPUT MONTHS
    	months = scanner.nextDouble();
    	if (CashDeposit < 0 || AnnualYield < 0 || months < 0) {
        System.out.print("\nERROR, PLEASE ENTER POSITIVE VALUE FOR ALL OF THE INPUT!  "); //PRINT ERROR IF ONE OF THE VALUES NEGATIVE
    	}
    } while (CashDeposit < 0 || AnnualYield < 0 || months < 0); //END WHILE LOOP
    
    System.out.print("\nMONTH CD VALUE\n\n");
    CDValue = CashDeposit;										//ASSIGN THE CD VALUE TO CASH DDEPOSIT
	
    for (int i = 1; i <= months; i++) {							//FOR LOOP 
    	
    	CDValue += CDValue * (AnnualYield / 1200); 	
		System.out.printf("%-7d %.2f \n", i, CDValue);
		
        }
    }catch(InputMismatchException e) {
		System.out.println("\nINVALID INPUT");
		main(args);
    }catch(Exception e) {
		System.out.println("\nSOMETHING WENT WRONG");
		main(args);
    }finally {
		scanner.close();
}
}
}