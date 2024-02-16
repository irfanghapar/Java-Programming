import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class Question_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String grade = null, gender = null;		// declare grade, gender
		double year = 0, weight = 0;			// declare year, weight
		String name = null;						// declare name
		double babies = 10;						// declare babies as 10
		int i = 0;								// int i = 0
		
		File Output = new File("OutputFile.txt"); 	// declare outputfile.txt as output
		FileWriter pw = new FileWriter(Output);		// filewriter output pw delcare
		PrintWriter fw = new PrintWriter(pw);		// printwriter to print the input
		
		fw.println("_________________________________________________________");
		fw.println("YEAR	GENDER		WEIGHT(KG)		NAME");
		fw.println("_________________________________________________________");
		try {
			
		while (i < babies) {
		System.out.printf("PLEASE ENTER YEAR (2001-2010)			:	"); // YEAR INPUT
    	year = scanner.nextDouble();
		System.out.printf("PLEASE ENTER GENDER (MALE/FEMALE)		:	");	// GENDER INPUT
    	gender = scanner.next();
		System.out.printf("PLEASE ENTER YOUR WEIGHT(KG)			:	");		// WEIGHT INPUT
    	weight = scanner.nextDouble();
		System.out.printf("PLEASE ENTER YOUR NAME				:	");		// NAME INPUT
    	name = scanner.next();
    	i++;
		fw.println(year+ "\t" + gender + "\t\t\t" + weight + "\t\t" + name); // output for year, gender weight and name

		}
		
    	scanner.close();

	    }catch(InputMismatchException e) {
			System.out.println("\nINVALID INPUT, PLEASE RE-ENTER AGAIN"); //catch exception if wrong input need to enter again
			main(args);
	    }catch(Exception e) {
			System.out.println("\nSOMETHING WENT WRONG");
			main(args);
	    }finally {
	    	
	    }
		fw.close();
	}

	}

