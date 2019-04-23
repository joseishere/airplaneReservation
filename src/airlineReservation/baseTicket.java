package airlineReservation;


public class baseTicket {
	
	private double price;
	private int ticketNumber;
	private String origin;
	private String destination;
	private String customerID;
	
	public baseTicket(double price, int ticketNumber, String origin, String destination,
			String customerID) {
		
		this.price = price;
		this.ticketNumber = ticketNumber;
		this.origin = origin;
		this.destination = destination;
		this.customerID = customerID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String toString() {
		return "Price: " + this.price + ", Ticket#: " + this.ticketNumber +
				", Origin: " + this.origin.toUpperCase() + ", Destination: " + this.destination.toUpperCase() + 
				", CustomerID: " + this.customerID.toUpperCase();
	}
	
	public String toStrings() {
		return this.customerID.toUpperCase();
	}	
}
