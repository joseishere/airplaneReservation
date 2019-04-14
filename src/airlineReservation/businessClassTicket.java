package airlineReservation;

import java.sql.Date;
import java.sql.Time;

public class businessClassTicket extends baseTicket {
	
	private int baggageNum;
	private float frequentFlyerMiles;
	private boolean openBar;
	private boolean moreLegRoom;
	
	
	
	public businessClassTicket(double price, int ticketNumber, String origin, String destination, String customerID,
			boolean roundTrip, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,
			int baggageNum, float frequentFlyerMiles, boolean openBar, boolean moreLegRoom) {
		super(price, ticketNumber, origin, destination, customerID, roundTrip, departureDate, departureTime,
				arrivalDate, arrivalTime);
		this.baggageNum = baggageNum;
		this.frequentFlyerMiles = frequentFlyerMiles;
		this.openBar = openBar;
		this.moreLegRoom = moreLegRoom;
	}
	
	public int getBaggageNum() {
		return baggageNum;
	}
	public void setBaggageNum(int baggageNum) {
		this.baggageNum = baggageNum;
	}
	public float getFrequentFlyerMiles() {
		return frequentFlyerMiles;
	}
	public void setFrequentFlyerMiles(float frequentFlyerMiles) {
		this.frequentFlyerMiles = frequentFlyerMiles;
	}
	public boolean isOpenBar() {
		return openBar;
	}
	public void setOpenBar(boolean openBar) {
		this.openBar = openBar;
	}
	public boolean isMoreLegRoom() {
		return moreLegRoom;
	}
	public void setMoreLegRoom(boolean moreLegRoom) {
		this.moreLegRoom = moreLegRoom;
	}
	
	
	
	
	
}
