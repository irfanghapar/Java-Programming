**Question 1**<b/>

Write a program that reads three data (type double) from user, calculates and display the average of the three data read. Use the methods as described below:

(a) A method named readInput that reads three data (type double) from user and stores them in variables num1, num2, and num3.<b/><b/>
(b) A method named calcAverage that calculates the average of three data (type double) and stores the result in a variable named average. <b/><b/>
(c) A method named printOutput that displays the value stored in a variable named average. <b/><b/>

Use parameters and return value for data sharing.<b/><b/>
**Note**: Draw the flowchart diagram and pseudocode for Question 1<b/><b/>

**Question 2**<b/>
Write a program that contains the following two methods:<b/>
_public static double celsiusToFahrenheit(double Celsius)_<b/>

- converts from Celsius to Fahrenheit<b/>
  
_public static double fahrenheitToCelsius (double Fahrenheit)_<b/>

- converts from Fahrenheit to Celsius
  
The formula for the conversion is:<b/>
_fahrenheit = (9.0 / 5) * celsius + 32_<b/><b/>
Write a program that invokes these methods to display the following tables: <b/><b/>
![image](https://github.com/irfanghapar/Java-Programming/assets/87377657/94008cf2-d3e6-42c7-af3d-c8f4b71cdea8)

**Question 3**<b/>
This problem is to handle telephone billing for customers. The billing depends on the type of the usage package chosen by the customer, i.e. Package 1 or Package 2. For Package 1, theminimum monthly charge of RM50.00 is assessed if the usage (call time) is less than or equal to
1000 minutes. Otherwise, the rate of RM0.18 per minute is charged for the first 1000 minutes and the rate of RM0.35 per minute is charged for the additional usage. For Package 2, the rate of RM0.18 per minute is charged for the usage less than or equal to 1000 minutes. Any additional
usage is charged at RM0.55 per minute. You are required to write a program that will read the amount of telephone usage (call time) in minutes and the customer package, and display the amount of call time, the package type, and
the amount to be paid by the customer. 

Write the following methods and the main method for the program:<b/>
/* method to read in from console and return the amount of telephone usage (call time) */<b/>
public static int readCallTime(Scanner input)<b/>
/* method to read in from console and return the customer package */<b/>
public static int readTypeAcct(Scanner input)<b/>
/* method to calculate and return the amount due (to be paid) for the telephone usage.<b/>
Formal parameters are the call time and customer package */<b/>
public static double calculateBill(int calltime, int packageType)<b/>
/* method to display output */<b/>
public static void printBill(int calltime, int packageType, double amountDue)<b/><b/>
**Note**: Use the value “Yes”/“No” or 0 to allow the user to continue or quit the program.
