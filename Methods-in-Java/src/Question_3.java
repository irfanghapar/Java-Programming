import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_3 {
	static Scanner scanner = new Scanner(System.in);
	  public static void main (String[] args) {
		  
		 
		  double amountDue, call, account; // declaring new variable to assign to modules
		  int i = 1;						// declare i for continue and exit condition for while
		  
		  while (i == 1) {
		
		  call = readCallTime();						// assign call to readcalltime module with values
		  account = readTypeAcct();						// assign account to readTypeAcct with values
		  amountDue = calculateBill(call, account);		// assign value amountdue to calculatebill method with values
		  printBill(call, account, amountDue);			// calling print bill method
		  
		  System.out.printf("\n\nPLEASE ENTER 1 TO CONTINUE AND 0 TO EXIT SYSTEM :    "); // 1 or 0 for exit or continue 
		  i = scanner.nextInt();
		  }
	  }
	  public static double readCallTime(){	// call time module 
			System.out.printf("\nAMOUNT OF MINUTES USAGE    		  :    ");	// input for amount minutes usage
		    double calltime = scanner.nextDouble();
		    while(calltime<0) {
				System.out.println("The amount of call time is not valid. Please try again: ");
				calltime = scanner.nextDouble();
		    }
		    return calltime;										// return call time
	  }
	  public static double readTypeAcct() {							// account type module
			System.out.printf("WHAT IS YOUR PACKAGE TYPE (1/2)?  	  :    "); // input for account type
		    double packageType = scanner.nextDouble();				
		    while(packageType!=1 && packageType!=2) {
	    		System.out.println("The package type is not valid please try again: ");
	    	  packageType=scanner.nextInt();
	    	}
		    return packageType;										// return value package type 
	  }
	  public static double calculateBill(double calltime, double packageType) { // calculatebill modules
		  double amountDue = 0;
		  if(packageType == 1) {								// first package type condition
			  if (calltime <= 1000) { 							// condition one with call time less than 100
				  amountDue = 50;
			  }else if (calltime > 1000) {	// condition call time between 1000 minutes and 2000 minutes
				  amountDue = (0.18 * 1000) + ((calltime-1000) * 0.35);
			  }
		  }	else if(packageType == 2) {							// second package type condition
			  if (calltime <= 1000) { 							// calltime less than 1000 minutes
				  amountDue = (calltime * 0.18);				// calculate amount due
			  } else if (calltime > 1000) {						// call time condition more than 1000
				  amountDue = (1000 * 0.18) + ((calltime -1000) * 0.55);
			  } 
	  }
		  return amountDue;										// return amount due
	  }
	  public static void printBill(double calltime, double packageType, double amountDue) { // module for last output calltime, packagetype and amountdue
			System.out.printf("\nCALL TIME |\tPACKAGE TYPE\t|\tAMOUNT DUE\n");
			System.out.printf("--------------------------------------------------------------------------\n");	  
			System.out.printf(calltime + "\t  |\t" + packageType + "\t\t|\tRM " + amountDue); // print

}
}