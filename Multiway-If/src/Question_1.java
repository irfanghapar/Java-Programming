import java.util.Scanner;

// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 5

public class Question_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Retirement;																						// DECLARE STRING FOR 3% RETIREMENT PAY 
		double HoursWorked, SkillLevel = 0, PayRate = 0, RegularPay = 0, OverPay = 0; 							// DECLARE PAY RATE, HOURSWORKED, REGULAR AND OVERTIME PAY
		double TotalRegOverPay = 0, InsuranceOpt = 0;															// DECLARE TOTALPAY, INSURANCE OPTION, GROSSPAY, 
		double RegularPaySkill1 = 17.0, RegularPaySkill2 = 20.0, RegularPaySkill3 = 22.0, TotalDeductions = 0;	// DECLARE THE CONSTANT FOR SKILL 1,2,3 OPTION
		double Insurance1 = 0, Insurance2 = 0, Insurance3 = 0, RetirementPay = 0, NetPay = 0;					// DECLARE INSURANCE 1, 2, 3 RETIREMENT AND NET PAY
		
		System.out.printf("Enter your skill level (1/2/3) : ");													// ASK FOR SKILL LEVEL
		SkillLevel = scanner.nextDouble();																		// GET THE INPUT FOR SKILL LEVEL
		System.out.printf("\nEnter your hours worked : ");														// ASK HOURS WORKED
		HoursWorked = scanner.nextDouble();																		// GET INPUT FOR HOURS WORKED
		
		if (SkillLevel == 1) {																					// FIRST CONDITION FOR SKILL LEVEL 1
			if(HoursWorked > 40) {																				// STATEMENT FOR HOURS WORKED MORE THAN 40
			RegularPay = RegularPaySkill1 * 40;																	// CALCULATE REGULAR PAY FOR 40 HOURS
			PayRate = RegularPaySkill1 * 1.5;																	// CALCULATE FOR PAY RATE TO BE 1.5 TIME MORE
			OverPay = PayRate * (HoursWorked - 40);																// CALCULATE THE OVERTIME PAY
			TotalRegOverPay = RegularPay + OverPay;																// CALCULTE THE TOTAL REGULAR AND OVERTIME PAY
			
			} else if ((HoursWorked >= 0) && (HoursWorked < 40)) {												// CONDITION FOR HOURS WORKED LESS THAN 40
			RegularPay = HoursWorked * RegularPaySkill1;														// CALCULATE REGULAR PAY
			TotalRegOverPay = RegularPay;													
			PayRate = RegularPaySkill1;																			// CALCULATE PAY RATE
			
			} else {
			System.out.printf("Wrong input\n");																	// OUTPUT IF USE ENTER WRONG INPUT
			}
			
		} else if (SkillLevel == 2) {																			// FIRST CONDITION FOR SKILL LEVEL 2
			if(HoursWorked > 40) {																				// STATEMENT FOR HOURS WORKED MORE THAN 40
			RegularPay = RegularPaySkill2 * 40;																	// CALCULATE REGULAR PAY FOR 40 HOURS
			PayRate = RegularPaySkill2 * 1.5;																	// CALCULATE FOR PAY RATE TO BE 1.5 TIME MORE
			OverPay = PayRate * (HoursWorked - 40);																// CALCULATE THE OVERTIME PAY
			TotalRegOverPay = RegularPay + OverPay;																// CALCULTE THE TOTAL REGULAR AND OVERTIME PAY
			
			} else if ((HoursWorked >= 0) && (HoursWorked < 40)) {												// CONDITION FOR HOURS WORKED LESS THAN 40
			RegularPay = HoursWorked * RegularPaySkill2;														// CALCULATE REGULAR PAY
			TotalRegOverPay = RegularPay;
			PayRate = RegularPaySkill2;																			// CALCULATE PAY RATE
			
			} else {
			System.out.printf("Wrong input\n");																	// OUTPUT IF USE ENTER WRONG INPUT
			}
			
		} else if (SkillLevel == 3) {																			// FIRST CONDITION FOR SKILL LEVEL 2
			if(HoursWorked > 40) {																				// STATEMENT FOR HOURS WORKED MORE THAN 40
			RegularPay = RegularPaySkill3 * 40;																	// CALCULATE REGULAR PAY FOR 40 HOURS
			PayRate = RegularPaySkill3 * 1.5;																	// CALCULATE FOR PAY RATE TO BE 1.5 TIME MORE
			OverPay = PayRate * (HoursWorked - 40);																// CALCULATE THE OVERTIME PAY				
			TotalRegOverPay = RegularPay + OverPay;																// CALCULTE THE TOTAL REGULAR AND OVERTIME PAY
			
			} else if ((HoursWorked >= 0) && (HoursWorked < 40)) {												// CONDITION FOR HOURS WORKED LESS THAN 40
			RegularPay = HoursWorked * RegularPaySkill3;														// CALCULATE REGULAR PAY
			TotalRegOverPay = RegularPay;
			PayRate = RegularPaySkill3;																			// CALCULATE PAY RATE
			
			} else  {
			System.out.printf("Wrong input\n");																	// OUTPUT IF USE ENTER WRONG INPUT
		}
		}
	
		if ((SkillLevel == 2) || (SkillLevel == 3)) {															// CONDITION FOR SKILL LEVEL 2 OR 3
			System.out.printf("Please choose your insurance option (0/1/2/3/) : ");								// ASK USER TO CHOOSE INSURANCE OPTION
			InsuranceOpt = scanner.nextDouble();																// GET THE INPUT FOR INSURANCE OPTION
			
			if (InsuranceOpt == 1) {																			// CONDITION FOR INSURANCE OPTION 1
				System.out.printf("\nYour insurance option is Medical Insurance\n");							// OUTPUT FOR INSURANCE OPTION 1
				 Insurance1 = 32.50;																			// DECLARE PRICE FOR INSURANCE1
				 TotalDeductions = Insurance1;																
				 NetPay = TotalRegOverPay - Insurance1;															// CALCULATE THE NET PAY
				 
			} else if(InsuranceOpt == 2) {																		// CONDITION FOR INSURANCE OPTION 2 
				System.out.printf("\nYour insurance option is Dental Insurance\n");								// OUTPUT FOR INSURANCE OPTION 2
				 Insurance2 = 20.0;																				// DECLARE PRICE FOR INSURANCE2
				 TotalDeductions = Insurance2;
				 NetPay = TotalRegOverPay - Insurance2;															// CALCULATE THE NET PAY
				 
			} else if (InsuranceOpt == 3) {																		// CONDITION FOR INSURANCE OPTION 1
				System.out.printf("\nYour insurance option is Disability Insurance\n");							// OUTPUT FOR INSURANCE OPTION 1
				 Insurance3 = 10.0;																				// DECLARE PRICE FOR INSURANCE1
				 TotalDeductions = Insurance3;		
				 NetPay = TotalRegOverPay - Insurance3;															// CALCULATE THE NET PAY
				 
			} else {
				System.out.printf("You dont have any insurance\n");												// OUTPUT FOR ZERO OR NO INSURANCE TAKEN
			}
			
		} else if (SkillLevel == 1) {																			// CONDIION FOR SKILL LEVEL 1
			System.out.printf("\nYou are not valid to have any insurance\n");									// PRINT YOU ARE NOT VALID TO HAVE ANY INSURANCE
			Insurance1 = 0;	
			NetPay = TotalRegOverPay;																			// NETPAY WILL BE EQUAL TO TOTAL REGULAR AND OVERTIE PAY
		}
		
		if (SkillLevel == 3) {																					// CONDITION FOR SKILL LEVEL 3
			System.out.printf("\nDo you want to elect in retirement plan (Yes / No ) ? : ");					// ASK FOR RETIREMENT PLAN
			Retirement = scanner.next();																		// SCAN FOR THE RETIREMENT INPUT YES OR NO
				if (Retirement.equals("Yes")) {																	// CONDITION FOR YES
					RetirementPay = TotalRegOverPay * 0.03;														// CALCULATE RETIREMENT PAY
					NetPay -= RetirementPay;																	// CALCULATE NET PAY
					TotalDeductions += RetirementPay;															// CALCULATE TOTAL DEDUCTIONS
				} else if (Retirement.equals("No")) {															// CONDITION FOR NO STATEMENT
					System.out.printf("Thank you\n");															// PRINT THANK YOU
				}
				else {																	
					System.out.printf("ERROR\n");																// PRINT ERROR
		}
		}
		
		if(NetPay > 0 ) {																						// CONDITION FOR NET PAY MORE THAN DEDUCTIONS
		System.out.printf("\n\n\t<< PAYMENT RECEIPT >>\n");												
		System.out.printf("\n HoursWorked                     :   " + HoursWorked);								// PRINT HOURS WORKED
		System.out.printf("\n Hourly Pay Rate                 : RM" + PayRate );								// PRINT PAY RATE
		System.out.printf("\n Regular Pay                     : RM" + RegularPay );								// PRINT REGULAR PAY
		System.out.printf("\n Overtime Pay                    : RM" + OverPay );								// PRINT OVERTIME PAY
		System.out.printf("\n Total Regular and Overtime Pay  : RM" + TotalRegOverPay);							// PRINT TOTAL REGULAR AND OVERTIME PAY
		System.out.printf("\n Total Deductions                : RM" + TotalDeductions);							// PRINT TOTAL DEDUTIONS
		System.out.printf("\n Net Pay                         : RM" + NetPay);									// PRINT NET PAY
		
		} else if (NetPay < 0) {
			System.out.printf("\nERROR YOUR NET PAY SHOULD BE MORE THAN DEDUCTIONS");							// CONDITION FOR DEDUCTIONS MORE THAN NET PAY								
		}
	}
}

