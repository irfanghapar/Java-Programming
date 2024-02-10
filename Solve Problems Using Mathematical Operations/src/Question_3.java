import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 2

public class Question_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double DrivingDistance, MilesPerGallon, PricePerGallon, DrivingCost;
		
		System.out.print("Enter the driving distance          :     ");
		DrivingDistance = scanner.nextDouble();
		System.out.print("Enter the miles per gallon distance :     ");
		MilesPerGallon = scanner.nextDouble();
		System.out.print("Enter the price per gallon distance :     ");
		PricePerGallon = scanner.nextDouble();
		
		DrivingCost = (DrivingDistance / MilesPerGallon) * PricePerGallon;
		
		System.out.print("The cost of driving is              :     RM  " + DrivingCost);
	}
}
		