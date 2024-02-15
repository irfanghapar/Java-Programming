// AHMAD IRFAN BIN ABDUL GHAPAR
// 210923
// LAB NO 6

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);  
    
    double floors = 0, rooms = 0, roomsOccupied = 0, Totalrooms = 0;
    double TotalOccupiedRooms = 0, Occupancyrate = 0;
    
    try {
    do {
    	System.out.print("\nNUMBER OF FLOORS	: ");	// USER INPUT NUMBER OF FLOORS
    	floors = scanner.nextDouble();
    } while (floors < 1);								// LOOP FOR NUMBER OF FLOOR
    
    for (int i = 1; i <= floors; i++) {
    
    	System.out.print("\nFLOOR\t" + i);			
    	do {
    		System.out.print("\nNO OF ROOMS		: ");	// USER INPUT NUMBER OF ROOMS
    		rooms = scanner.nextDouble();
    	} while (rooms < 10);
    
    	Totalrooms += rooms;							// CALCULATE ALL TOTAL OF ROOMS
    
    	do {
    		System.out.print("NO OF OCCUPIED ROOMS	: ");	// USER INPUT NO OF OCCUPIED ROOMS
    		roomsOccupied = scanner.nextDouble();
    	} while (roomsOccupied < 0);					// LOOP THE NUMBER OF OCCUPIED ROOMS
    
        TotalOccupiedRooms += roomsOccupied;
    }
    
    Occupancyrate += TotalOccupiedRooms / Totalrooms * 100;							// CALCULATE OCCUPANCY RATE
    System.out.print("\nTOTAL NO OF ROOMS		:  " + Totalrooms);					// PRINT TOTAL NO OF ROOMS
    System.out.print("\nTOTAL NO OF OCCUPIED ROOMS	:  " + TotalOccupiedRooms);		// PRINT TOTAL NO OF OCCUPIED ROOMS
    System.out.print("\nOCCUPANCY RATE			:  " + Occupancyrate);				// PRINT OCCCUPANCY RATE
    
    }catch(InputMismatchException e) {
		System.out.println("\nINVALID INPUT");										// EXCEPTION IF IF USER INPUT WRONG 
		main(args);
    }catch(Exception e) {
		System.out.println("\nSOMETHING WENT WRONG");
		main(args);
    }finally {
		scanner.close();
    }
}
}