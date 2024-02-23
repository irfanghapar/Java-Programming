import java.util.Scanner;
import java.util.InputMismatchException;

public class Question_3 {
	
	public static Scanner input = new Scanner(System.in);	
		public static void main (String[] args) {
			//Scanner input = new Scanner(System.in);
			String[] studentname = new String[5]; // DECALRE STRING ARRAY OF ELEMENTS FOR STUDENT NAME
			double[][] Score = new double[5][4]; // DECLARE SCORE FOR 5 AND 4 ELMENT
			char[] grade = new char[5]; // DECLARE GRADE FOR 5 ELEMENTS
			double[] sum = new double[5]; // DECALRE 5 ELEMETNS OF SUM ARRAY
			getStudentNames(studentname); // CALL GET STUDENT NAMES METHOD
			getScore(Score, studentname); // CALL GET SCORE METHOD
			getstudentsgrade(Score, sum, grade);
			System.out.println("\n------------DISPLAYING RESULTS-----------") ;
			System.out.println("STUDENT NAME \t\t GRADES");
			for(int i=0;i<5;i++) // LOOP 5 TIMES 
			{
			System.out.println(studentname[i]+"\t\t\t	"+	grade[i]);	// PRINT STUDENT NAME AND GRADE FOR RESULTS ALL OF THE OUTPUT
			}
			  
			}
		public static void getScore ( double[][] Score, String studentname[]) { 
			for(int i = 0; i < 5; i++) {
				System.out.printf("\nPLEASE ENTER MARK FOR\t" + studentname[i] + "\n");	// ASK USER TO ENTER THE SCORES ACCORDING TO THEIR NAME
				for(int z = 0; z < 4; z++) {
				do {
				System.out.printf("PLEASE ENTER SCORE\t" + (z +1) + "	:	");	// ASK USER TO ENTER THEIR SCORES 1
				Score[i][z] = input.nextDouble();
				if(Score[i][z] > 100) {
					System.out.printf("ERROR\n"); // PRINT ERROR IF WRONG INPUT 
				}
				}
				while(Score[i][z] > 100); // LOOP IF USER ENTER WRONG INPUT WHICH MORE THAN 100 MARK
				}
				}
			}
		public static void getStudentNames(String[] studentname) {	// METHOD TO GET STUDENT NAMES
			for(int i = 0; i < 5; i++) {
				System.out.printf("PLEASE ENTER NAME FOR STUDENT NUMBER\t" + (i+1) + "	:	");	// ASK USER TO ENTER THEIR NAMES
				studentname[i] = input.nextLine();
			}
		}
		public static void getstudentsgrade(double[][] Score, double[] sum, char[] grade) { // METHOD TO CALCULATE THE AVERAGE AND GET THE GRADE
			for(int i = 0; i < 5; i++){ // LOOP TO CREATE SUM
				for(int j=0; j<4; j++){
					sum[i]=0;
				}
			}
			for(int i=0;i<5;i++) { 	// LOOP FOR 5 TIMES ( STUDENT NUMBERS
				for(int j=0;j<4;j++){ // LOOP FOR 4 TIMES (SCORE)
					sum[i]=sum[i]+Score[i][j]; // CALCULATE THE TOTAL SUM
				}
			}
			for(int z=0; z < 5; z++){ // LOOP FOR 5 TIMES (NUMBER OF STUDENT)
				sum[z] = sum[z]/4; // DIVIDE BY 4 TO CALCULATE AVERAGE
			}
			for(int z=0; z < 5; z++){	// LOOP FOR 5 TIMES
			if(sum[z] >= 90 && sum[z] <= 100) { // CONDITION FOR GRADE A
				grade[z] = 'A';
			}else if(sum[z] >= 80 && sum[z] <= 89) { // CONDITION FOR GRADE B
				grade[z] = 'B';
			}else if(sum[z] >= 70 && sum[z] <= 79) {  // CONDITION FOR GRADE C
				grade[z] = 'C';
			}else if(sum[z] >= 60 && sum[z] <= 69) { // CONDITION FOR GRADE D
				grade[z] = 'D';
			}else if(sum[z] <= 60) { // CONDITION IF GRADE FAIL
				grade[z] = 'F';
			}
			}
		}
}

