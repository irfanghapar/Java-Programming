import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class Question_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String grade = null;
		
		String fname = "StudentsData.txt";				// declare fname as filne name students data.txt
		File Input = new File(fname);					
		File Output = new File("StudentsGrade.txt");	// declare file output as students grade
		FileWriter fw = new FileWriter(Output);
		PrintWriter pw = new PrintWriter(fw);
		
		
		if(!Input.exists()) {
			System.out.println("File "+ fname +" not exists"); 		//If input not print file does not exists
			System.exit(0);
		}
		Scanner input = new Scanner(Input);
		while(input.hasNext()) {
		String matric = input.next();					// matric input
		String name = input.next();						// name input
		float firstest= input.nextFloat();				// firsttest input
		float secondtest= input.nextFloat();			// secondtest input
		float thirdtest= input.nextFloat();				// thirdtest input
		float fourthtest= input.nextFloat();			// fourthtest input
		float fifthtest= input.nextFloat();				// fifthtest input
		
		double AverageTotal= (firstest + secondtest + thirdtest + fourthtest + fifthtest)/5; //calculate average total
		
		if(AverageTotal>=90)							// condition for grade A, B, C, D, F
			grade = "A";
		else if(AverageTotal>=80 && AverageTotal<90)
			grade = "B";
		else if(AverageTotal>=70 && AverageTotal<80)
			grade = "C";
		else if(AverageTotal>=60 && AverageTotal<70)
			grade = "D";
		else if(AverageTotal>=0 && AverageTotal<60)
			grade = "F";
		// print matric, name, firsttest, secondtest, thirdtest, fourthtest and fifthtest
		pw.printf("%-12s %-10s %-10s %-10s %-10s %-10s %-10s\n", matric, name, firstest, secondtest, thirdtest, fourthtest, fifthtest);
	}
		input.close(); //close input
		pw.close(); 	// close output
	}
}
