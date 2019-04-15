package airlineReservation;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class simpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nWelcome employee #6932-C");
		System.out.println("Please remember to be kind and sweet to all of the customers today!\n");
		System.out.println("\t\tMessage from: John Dawn - CEO of Starship Airlines");
		
		int option = 0;
		while(option == 0) {
			System.out.println("What would you like to do employee #6932-C ?");
			System.out.println("1. Sell Airplane Tickets\n"
					+ "2. Check loading/unloading schedule\n"
					+ "3. View all tickets sold\n"
					+ "4. Call for loading/unloading\n"
					+ "5. Clock out\n");
			Scanner scan = new Scanner(System.in);
			int employeeChoice = scan.nextInt();
			
			switch(employeeChoice) {
			case 1:
				System.out.println("Here we could call a function to take in customer info to sell the ticket\n");
				break;
			case 2:
				System.out.println("Here we would simply print out the full stack\n");
				break;
			case 3:
				System.out.println("Here we would print out the linkedlists that will hold our ticket objects\n");
				break;
			case 4:
				System.out.println("Here we can import time and have a function that will pop the stack and print out that pop every 2 seconds.");
				System.out.println("Like this: ");
				for(int i = 1; i < 4; i++) {
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Customer[" + i + "] time to get on the plane");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println();
				break;
			case 5:
				System.out.println("All you humans are the same, the only one that works as hard as I do is John Dawn - CEO of Starship Airlines");
				System.out.println("Enjoy your rest employee #6932-C\n");
				option = 1;
				break;
			default:
				System.out.println("Please human, read the directions and answer correctly!");
			}
			
			
			
		}
		
	}
	
}
