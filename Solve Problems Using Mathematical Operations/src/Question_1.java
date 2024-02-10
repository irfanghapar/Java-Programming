import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 2 ()

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double FirstTest, SecondTest, Assignment1, Assignment2, Assignment3, FinalExam;
		double TotalAssMark, TotalAssPercent, FinalExamPercent, TotalInPercent;
		double Test1Percent, Test2Percent;
		
		System.out.println("                    COMPUTER PROGRAMMING I (CSC3100)                \n");
		System.out.println("******************MARKS EVALUATION APPLICATION********************* \n");
		System.out.println("PLEASE ENTER MARKS : \n");

		
		System.out.print("FIRST TEST   : ");
		FirstTest = scanner.nextDouble();
		System.out.print("SECOND TEST  : ");
		SecondTest = scanner.nextDouble();
		System.out.print("ASSIGNMENT 1 : ");
		Assignment1 = scanner.nextDouble();
		System.out.print("ASSIGNMENT 2 : ");
		Assignment2 = scanner.nextDouble();
		System.out.print("ASSIGNMENT 3 : ");
		Assignment3 = scanner.nextDouble();
		System.out.print("FINAL EXAM   : ");
		FinalExam = scanner.nextDouble();
		
		Test1Percent = (FirstTest / 50) * 20;
		Test2Percent = (SecondTest / 50) * 20;

		
		TotalAssMark = Assignment1 + Assignment2 + Assignment3;
		TotalAssPercent = (TotalAssMark / 90) * 30;

		FinalExamPercent = (FinalExam / 100)  * 30;

		TotalInPercent = (Test1Percent + Test2Percent + TotalAssPercent + FinalExamPercent);
		
		System.out.println("\nCALCULATED MARKS : \n");
		System.out.print("FIRST TEST\tSECOND TEST\tASS 1\tASS 2\tASS 3\tASSIGNMENT SUB-TOTAL\t\tFINAL EXAMINATION TOTAL\t\tTOTAL\n");
		System.out.println(FirstTest+"(" + Test1Percent+"%)\t"+SecondTest+"("+Test2Percent+"%)\t"+Assignment1+"\t"+Assignment2 +"\t"+Assignment3+"\t"+TotalAssMark+"("+TotalAssPercent+"%)\t"+FinalExam +"("+FinalExamPercent +"%)\t        "+TotalInPercent+"%");

	}
}


