public class Question_02 {
	public static void main(String[] args) {
		
		double celsius, fahrenheit;		// decalre celsius and fahrenheit
		
		System.out.println("Celcius\tFahrenheit\t|\tFahrenheit\t Celcius   |");
		System.out.println("-------------------------------------------------------------");
		
		for(celsius = 40.0, fahrenheit = 120.0; celsius > 30.0; celsius--, fahrenheit-=10) {	// for loop
			System.out.printf("%-10.2f", celsius);							// print celsius
			System.out.printf("%-22.2f", celciusToFahrenheit(celsius));		// call celsius to fahrenheit method
			System.out.printf("%-19.2f", fahrenheit);						// print fahrenheit
			System.out.printf("%-15.2f\n", fahrenheitToCelcius(fahrenheit));//call fahrenheit to celsius method
		}
	}
	public static double celciusToFahrenheit(double celsius) { // method for celsius to fahreneheit
		
		double fahrenheit = (9.0 / 5) * celsius + 32;			// calculate fahrenheit
		return fahrenheit;										// return fahrenheit
	}
	public static double fahrenheitToCelcius(double fahrenheit) {
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);		// calculate celsius
		return celsius;										// return celsius
		
	}
}