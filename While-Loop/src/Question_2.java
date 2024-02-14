// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 6

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);  

		int number = 0, sum = 0;
		int i = 1; //Declare i = 1 
		
        System.out.printf("Enter a positive number : "); // ask user to enter the positive number
        number = scanner.nextInt();
         
        while(i <= number) { // while looping with the number as condition
          sum = sum + i; // Calculate sum
          i++;			// Add 1 to i value for looping 
        } 
        System.out.println("\nTotal sum for all integers between 1 and  " + number +  "  is  " + sum); //print the total sum and number
   
	}

}
