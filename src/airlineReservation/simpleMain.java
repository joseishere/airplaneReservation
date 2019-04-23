package airlineReservation;

import java.sql.Date;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class simpleMain {
	
	//public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nWelcome employee #6932-C");
		System.out.println("Please remember to be kind and sweet to all of the customers today!\n");
		System.out.println("\t\tMessage from: John Dawn - CEO of Starship Airlines\n");
		
		Queue<baseTicket> ourQueue = new LinkedList<baseTicket>();
		LinkedList<baseTicket> ourList = new LinkedList<baseTicket>();
		Stack<baseTicket> ourStack = new Stack<baseTicket>();
		
		
		
		
		int option = 0;
		while(option == 0) {
			System.out.println("What would you like to do employee #6932-C ?");
			System.out.println("1. Sell Airplane Tickets\n"
					+ "2. Check loading/unloading schedule\n"
					+ "3. Call for loading\n"
					+ "4. Call for unloading\n"
					+ "5. Call for loading [simple]\n"
					+ "6. Call for unloading [simple]\n"
					+ "7. Clock out\n ");
			Scanner scan = new Scanner(System.in);
			int employeeChoice = scan.nextInt();
			
			switch(employeeChoice) {
			case 1:
				System.out.println("Ticket Sales\n");
				do {
					baseTicket tic = sellTickets();
					if(tic == null) {
						break;
					}else {
						ourList.add(tic);
						ourStack.add(tic);
						ourQueue.add(tic);
					}
					
					
					
				}while(ourList.size() > 0); {
					//baseTicket tic = sellTickets();
					//ourList.add(tic);
					
				}
				//scan.close();
				break;
			case 2:
				System.out.println("Passenger Schedule");
//				Stack<baseTicket> copyStack = (Stack<baseTicket>)ourStack.clone();
//				for(int i = 0; i < ourStack.size(); i++) {
//					System.out.println(copyStack.pop().toString());
//				}
				Iterator iter = ourQueue.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next().toString());
				}
				System.out.println();
				break;
			case 3:
				
				if(ourList.size() == 0) {
					System.out.println("Nobody is on your plane(s), sell more tickets!\n");
				}
				
				System.out.println("Passengers, Please board the Plane:");
				for(int i = 0; i < ourList.size(); i++) {
					try {
						TimeUnit.SECONDS.sleep(2);
						System.out.println(ourList.get(i).toString() + "\nNow Boarding\n");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					if(ourList.size()==ourList.size() && ourList.size()!=0)
						System.out.println("Your plane(s) have boarded!\n");
				break;
				
			case 4:
				//System.out.println("Passengers Deboarding");
				//System.out.println("Like this: \n");
				if(ourStack.size() == 0) 
					System.out.println("Nobody is on your plane(s), sell more tickets!\n");
				if(ourStack.size() >= 1) {
					System.out.println("Passengers Deboarding");
					int originalSize = ourStack.size();
					for(int i = 0; i < originalSize; i++) {
						try {
							TimeUnit.SECONDS.sleep(1);
							System.out.println(ourStack.pop().toString() + " \nHas Deboarded\n");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					if (ourStack.size() == 0)
						System.out.println("Your plane(s) has completely deboarded.");
						System.out.println();
					}
				}
				break;
			case 5:
				if(ourList.size() == 0) 
					System.out.println("Nobody is on your plane(s), sell more tickets!\n");
				if(ourList.size() >=1) {
					System.out.println("Passenger Boarding\n");
					for(int i = 0; i < ourList.size(); i++) {
						try {
							TimeUnit.SECONDS.sleep(2);
							System.out.println("Final Call for Passenger " + ourList.get(i).toStrings());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if(ourList.size()==ourList.size() && ourList.size()!=0)
					System.out.println("Your plane(s) have boarded!\n");
				break;
			case 6:
				if(ourStack.size() == 0) 
					System.out.println("Nobody is on your plane(s), sell more tickets!\n");
				if(ourStack.size() >= 1) {
					System.out.println("Passenger Deboarding\n");
					int originalSize2 = ourStack.size();
					for(int i = 0; i < originalSize2; i++) {
						try {
							TimeUnit.SECONDS.sleep(2);
							System.out.println("We've arrived, " + ourStack.pop().toStrings() + " please disembark.");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}	
						if (ourStack.size() == 0)
							System.out.println("Your Plane(s) has completely deboarded.\n");
					}
				}
				//ourStack.empty();
				break;
			
			case 7:
				System.out.println("All you humans are the same, the only one that works as hard as I do is John Dawn - CEO of Starship Airlines");
				System.out.println("Enjoy your rest employee #6932-C\n");
				option = 1;
				break;
			default:
				System.out.println("Please human, read the directions and answer correctly!");
			}
			
			
			
		}
		
		
	}
	
	
	public static baseTicket sellTickets() {
		System.out.println("Employee #6932-C, enter the type of Ticket Sale.");
		System.out.println("1. Coach\n2. Business Class\n3. Exit Ticket Sale");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		if(option == 1) {
			System.out.println("\tPlease enter Price, "
					+ "\n\tTicket Number, "
					+ "\n\tOrigin, "
					+ "\n\tDestination, "
					+ "\n\tand Customer ID.");
			System.out.println("Please do not mess up.");
			System.out.println("Please enter everything in one line, seperated by commas.\n");
			String[] inputs;
			Scanner scan2 = new Scanner(System.in);
			inputs = scan2.nextLine().trim().split(",");
			System.out.println("\nYou entered: ");
			for(int i = 0; i < inputs.length; i++) {
				inputs[i] = inputs[i].trim();
				System.out.print(inputs[i] + " ~ ");
			}
				
			baseTicket theTicket = new baseTicket(Double.parseDouble(inputs[0]), Integer.parseInt(inputs[1]), inputs[2], inputs[3], inputs[4]);
			System.out.println("\n");
			//scan.close();
			//scan2.close();	
			return theTicket;
			
			}
		else if(option == 2) {
			System.out.println("\tPlease enter Price, "
					+ "\n\tTicket Number, "
					+ "\n\tOrigin, "
					+ "\n\tDestination, "
					+ "\n\tCustomer ID, "
					+ "\n\tNumber of Bags, "
					+ "\n\tand Frequent Flyer Miles Earned");
			System.out.println("Please do not mess up.");
			
			
			System.out.println("Please enter everything in one line, seperated by commas\n");
			String[] inputs2;
			Scanner scan3 = new Scanner(System.in);
			inputs2 = scan3.nextLine().trim().split(",");
			System.out.println("\nYou entered: ");
			for(int i = 0; i < inputs2.length; i++) {
				inputs2[i] = inputs2[i].trim();
				System.out.print(inputs2[i] + " ~ ");
			}
				
			baseTicket theTicket = new businessClassTicket(Double.parseDouble(inputs2[0]), Integer.parseInt(inputs2[1]), inputs2[2], inputs2[3], inputs2[4], Integer.parseInt(inputs2[5]), Float.parseFloat(inputs2[6]));
			System.out.println("\n");
			//scan3.close();	
			return theTicket;
			
		}
		else if (option == 3)
			return null;
		else {
			System.out.println("You did not enter the correct option, try again");
			return null;
			
		}
		//baseTicket customerTicket = new baseTicket(Double.parseDouble(inputs[0]), Integer.parseInt(inputs[1]), inputs[2], inputs[3], inputs[4], true, Long.parseLong(inputs[6]), Long.parseLong(inputs[7]), Long.parseLong(inputs[8]), Long.parseLong(inputs[9]);
		// we kind of need the date and time information to come in as a long, but then that means we would have to generate it as a long
		// which would be kind of complicated
		// need to rethink this
		
	}
	
	
	
}
