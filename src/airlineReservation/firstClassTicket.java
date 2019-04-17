package airlineReservation;


public class firstClassTicket extends businessClassTicket {
	
	
	//WE ARE NOT USING THIS CLASS, IGNORE ALL OF IT
	
	private boolean fineDining;
	private boolean prioritySeating;
	
	// what else can we add here??
	// need ideas...
	
	
	public firstClassTicket(double price, int ticketNumber, String origin, String destination, String customerID,
			int baggageNum, float frequentFlyerMiles, boolean fineDining, boolean prioritySeating) {
		super(price, ticketNumber, origin, destination, customerID, baggageNum, frequentFlyerMiles);
		this.fineDining = fineDining;
		this.prioritySeating = prioritySeating;
	}
	
	public boolean isFineDining() {
		return fineDining;
	}
	
	public void setFineDining(boolean fineDining) {
		this.fineDining = fineDining;
	}
	public boolean isPrioritySeating() {
		return prioritySeating;
	}
	public void setPrioritySeating(boolean prioritySeating) {
		this.prioritySeating = prioritySeating;
	}
	

	
	

}
