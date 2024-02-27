import java.util.Scanner;
public class Question_1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner Input = new Scanner(System.in);
    
    int[] name = {0, 1, 2, 3, 4, 5, 6, 7}; // NAME EMPLOYEE (1,2,...)
    int[] employeehours = new int[8]; // ARRAY FOR HOURS OF EACH EMPLOYEE
    int[][] hours = {		// TABLE FOR HOURS 
        {2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9},
    };
    for(int i = 0; i < hours.length; i++) { // LOOP FOR CALCULATION OF TOTAL FIRST ROW
      int total = 0;
      for(int j = 0; j < hours[i].length; j++) { // LOOP FOR CALCULATION OF TOTAL FIRST COLUMN
        total += hours[i][j];  // CALCULATE TOTAL HOURS FOR EVERY EMPLOYEE
        employeehours[i] = total;
      }
    }
	 int temp = 0;
	 int employeenum = 0;
	 for(int i=0; i < employeehours.length;i++) { // LOOP FOR SWAPING AND SORTED THE ARRAY OF ELEMENTS FOR FIRST ROW
		for(int j=0; j < employeehours.length;j++) { // LOOP FOR SORTED ARRAY
		if(employeehours[i] < employeehours[j] )  { // CONDITION TO SORT ARRAY 
			employeenum = name[i]; // ASSIGN TO SORT THE NAME OF EMPLOYEE EX. EMPLOYEE 1,2 3,
			name[i] = name[j];
			name[j] = employeenum;
			temp = employeehours[i];
			employeehours[i] = employeehours[j];
			employeehours[j] = temp;
		}
		}
	 }
    for(int i = 0; i < employeehours.length; i++) { // LOOP FOR PRINTING THE TOTAL HOURS AND NAME OF EMPLOYEE
      System.out.print("Total hours for employees "+ name[i]+": "); // PRINT THE OUTPUT
      System.out.print(employeehours[i]); // PRINT EMPLOYEE HOURS
      System.out.println();
    }
  }
}

