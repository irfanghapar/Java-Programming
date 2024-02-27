import java.util.Scanner;
public class Question_2 {

  public static void main(String[] args) {
    
    double [][] matrix = inputmatrix(); // DECLARE MATRIX TO CALL INPUT MATRIX IN 2 D ARRAY
    for(int i = 0; i < matrix[0].length; i++) { // LOOP MATRIX 
    	System.out.println("The sum of the element " + i + " is " + sum(matrix, i)); // PRINT SUM OF ELEMENT FOR EACH ROW
    }
  }
    public static double [][] inputmatrix () { // METHOD TO GET INPUT MATRIX FOR EVERY ROW AND COLUMN
        Scanner Input = new Scanner(System.in);
        int Row = 3; // DECLARE ROW
        int Column = 4; // DECLCARE COLUMN
        double[][] k = new double[Row][Column]; //DECALRE K FOR ROW AND COLUMN
        
        System.out.println("Enter a number for " + Row + " row and " + Column + " column" ); // ASK USER TO ENTERR NUMBER FOR EVERY ROW AND COLUMN
        for(int row = 0; row < k.length; row++) { // LOOP TO ENTER INPUT FOR VERY ROW AND COLUMN
        	for(int col = 0; col < k[row].length; col++) { 
        		k[row][col] = Input.nextDouble(); // GET THE INPUT FOR EVERY INPUT
        	}
        }
        return k; // RETURN VALUE K
    }
    public static double sum(double[][] k, int index) { // METHOD FOR SUM THE ARRAY OF ROW
    	double sum = 0;
    	for(int i = 0; i < k.length; i++) { // LOOP FOR SUM
    		sum += k[i][index]; // CALCULATE THE SUM FOR EVERY ROW
    	}
    	return sum; // RETURN VALUE SUM
    }
  }
  