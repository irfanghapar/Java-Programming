import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Question_1 {
	  public static void main (String[] args) {
		  double sum, average;								// declaring sum and average
		 try {
			 
		  sum = readInput();								// assign value readInput to sum
		  average = calcAverage(sum);						// assign average to calcaverage for value sum
		  printOutput(average);								// calling printoutput average
		  
	    }catch(InputMismatchException e) {
			System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN\n"); //catch exception if wrong input need to enter again
			main(args);
	    }catch(Exception e) {
			System.out.println("\nSOMETHING WENT WRONG");
			main(args);
	    }finally {
	    	
	    }
	  }
	  public static double readInput(){
		double num1, num2, num3, sum;				// declaring num1, num2, num3
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter number 1 : ");		// input num1
	    num1 = scan.nextDouble();
	    System.out.print("Enter number 2 : ");		// input num2
	    num2 = scan.nextDouble();
	    System.out.print("Enter number 3 : ");		// input num3
	    num3 = scan.nextDouble();
	    return num1 + num2 + num3;					// calculate sum of the number and return to the next method
	  }
	  public static double calcAverage (double sum) { 	// method to call average
		  double average = sum / 3;						// calculate average for three numbers
		  return average;								// return average
	  }
	  public static void printOutput (double average) {		// method for printoutput average
		  System.out.printf("\nThe average for the three numbers is\t" + average);		// print
	  }

}