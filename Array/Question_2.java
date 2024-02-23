import java.util.Scanner;
public class Question_2 {

    public static void main(String[] args) {
        //DECLARATIONS 
        Scanner scanner = new Scanner (System.in);  
        int [] numlist = new int [10];  //DECLARE FOR NUMBER ARRAY OF 10 ELEMENTS
        int [] distinctArray = new int [10]; //DECLARE DISTINCT ARRAY OF 10 ELEMENTS
        int num = 0; // DELCARE NUM
        int counter = 0;  //DECLARE COUNTER
      
        eliminateDuplicate(numlist, distinctArray, counter, num);

    }
        public static void eliminateDuplicate(int[] numlist, int [] distinctArray, int counter, int num) {
            Scanner scanner = new Scanner (System.in);  
            //INPUT 
        	System.out.print("PLEASE ENTER 10 INTEGERS : "); //ASK USER TO ENTER 10 INTEGERS
            for (int i = 0; i < numlist.length; i++){	// LOOP FOR TO ASSIGN ELEMENT OF 10 ARRAYS
                num = scanner.nextInt(); 
                numlist[i] = num; // ASSIGN NUMBERS
            }
        // PROCESSING
        for (int i = 0; i < numlist.length; i++) {
        	boolean found = true;			// DECLARE BOOLEAN FOR FOUND 
            		for (int j = 0; j < counter ; j++){ // LOOP TO CHECK THE DUPLICATION
            			if (numlist[i] == distinctArray[j]) {
            				found = false;
            				break;
            			}
            		}
            if (found == true){
                distinctArray[counter++] = numlist[i];
            }
        }
        //OUTPUT
        System.out.println("THE NUMBER OF DISTINCT NUMBER : " + counter);
        System.out.print("THE DISTINCT NUMBER ARE ");
        for (int x = 0; x < counter; x++) {
            System.out.print(distinctArray[x] + " ");
        }
    }
}

