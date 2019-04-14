package airlineReservation;

import java.sql.Date;
import java.sql.Time;

public class baseTicket {
	
	private double price;
	private int ticketNumber;
	private String origin;
	private String destination;
	private String customerID;
	private boolean roundTrip;
	private Date departureDate;
	private Time departureTime;
	private Date arrivalDate;
	private Time arrivalTime;
	
	
	
	public baseTicket(double price, int ticketNumber, String origin, String destination,
			String customerID, boolean roundTrip, Date departureDate, Time departureTime, Date arrivalDate,
			Time arrivalTime) {
		
		this.price = price;
		this.ticketNumber = ticketNumber;
		this.origin = origin;
		this.destination = destination;
		this.customerID = customerID;
		this.roundTrip = roundTrip;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
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
	public boolean isRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Time getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	
}
