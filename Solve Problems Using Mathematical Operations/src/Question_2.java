import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 2

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double BaseValue, HeightValue, LengthValue, TriArea, TriVolume;
		
		System.out.print("Enter the base value            :     ");
		BaseValue = scanner.nextDouble();
		System.out.print("Enter the height value          :     ");
		HeightValue = scanner.nextDouble();
		
		TriArea = 0.5 * (BaseValue *  HeightValue);
		
		System.out.print("\nThe area of a triangle is       :     " + TriArea + " cm^2\n");
		System.out.print("Enter the length value          :     ");
		LengthValue = scanner.nextDouble(); 
		
		TriVolume =  TriArea * LengthValue;
		System.out.print("The volume of a triangle is     :     " + TriVolume + " cm^3");

				
	}
	}