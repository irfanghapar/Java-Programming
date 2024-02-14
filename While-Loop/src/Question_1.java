// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 6

import java.util.Scanner;
public class Question_1 {

    public static void main(String[] args)
    {
        //Declaring variables
        double sales1, sales2, sales3, sales4, sales5 = 0;

        //Creating scanner object
        Scanner scanner = new Scanner(System.in);  
        
        //Asking user for input for every stores
        System.out.print("Enter today's sales for store 1: ");
        sales1 = scanner.nextDouble();

        System.out.print("Enter today's sales for store 2: ");
        sales2 = scanner.nextDouble();

        System.out.print("Enter today's sales for store 3: ");
        sales3 = scanner.nextDouble();

        System.out.print("Enter today's sales for store 4: ");
        sales4 = scanner.nextDouble();

        System.out.print("Enter today's sales for store 5: ");
        sales5 = scanner.nextDouble();

        if(sales1 > 0 && sales2 > 0 && sales3 > 0 && sales4 > 0 && sales5 > 0) {
        //Displaying the sales bar chart
        
        System.out.println("\nSALES BAR CHART");
        
        // Display the asterisk for each store using while loop
        System.out.print("\nStore 1 : ");        
        while (sales1 > 0) {
            System.out.print("*");
            sales1 -= 100;
        }

        System.out.print("\nStore 2 : ");        
        while (sales2 > 0) {
            System.out.print("*");
            sales2 -= 100;
        }

        System.out.print("\nStore 3 : ");        
        while (sales3 > 0) {
            System.out.print("*");
            sales3 -= 100;
        }

        System.out.print("\nStore 4 : ");        
        while (sales4 > 0) {
            System.out.print("*");
            sales4 -= 100;
        }
        
        System.out.print("\nStore 5 : ");        
        while (sales5 > 0) {
            System.out.print("*");
            sales5 -= 100;
        }
        } else { //Print error if the user enter negative value
        System.out.print("\n\n ERROR, YOU MUST ENTER A POSITIVE VALUE !");        

    }
        }
}
