import java.util.Scanner; // imports the Scanner class

public class Question_1 {
public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		final int employee = 7;										// DECLARE EMPLOYEE AS CONSTANT
	 	int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489}; // ARRAY FOR EMPLOYEE ID IN 7 ELEMENTS
		int[] hours = new int[7]; // DECLARE ARRAY FOR HOURS
		double[] payRate = new double[employee]; // DECLARE ARRAY FOR PAY RATE
		double[] wages = new double[employee]; // DELCARE ARRAY FOR WAGES
		
		for(int x = 0; x < 7; x++) {	// LOOP CONDITION SEVEN TIMES 
		 System.out.printf("PLEASE ENTER YOUR HOURS : ");	// ASK USER TO ENTER HOURS
		 hours[x] = input.nextInt();						// READ HOURS FOR EVERY ELEMENT 
		 System.out.printf("PLEASE ENTER YOUR PAYRATE : "); // ASK USER TO ENTER PAY RATE
		 payRate[x] = input.nextInt(); // READ PAY RATE FOR EVERY ELEMENT
		 
		 if(hours[x] < 0 || payRate[x] < 6) { // CONDITION FOR WRONG INPUT
			 System.out.printf("INVALID NUMBER \n"); // PRINT INVALID
			 main(args);					// RETURN TO MAIN
		 }
		calcWages(employeeID, hours, payRate, wages, employee);	// CALL CALCWAGES METHOD
		displayWages(employeeID, wages, employee);				// CALL DISPLAYWAGES METHOD
		}
	}
		public static void displayWages(int[] employeeID, double wages[], int employee) {
			 System.out.printf("\n\tEMPLOYEE ID\tWAGES\n");
			 for(int i = 0; i < 7; i++) {					// LOOP FOR 7 TIMES ARRAY FOR WAGES AND EMPLOYEE ID
				 System.out.printf("\t" + employeeID[i] + "\t\t" + wages[i] + "\n"); // PRINT EMPLOYEE ID AND WAGES
		 }
		}
		public static void calcWages(int[] employeeID, int[] hours, double[] payRate, double[] wages, int employee) {
			for(int i = 0; i < employee; i++) {	// LOOP 7 TIMES TO CALCULATE FOR WAGES
				wages[i] = hours[i] * payRate[i]; // CALCULATE WAGES
		}
}
}