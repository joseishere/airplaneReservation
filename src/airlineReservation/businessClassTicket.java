package airlineReservation;


public class businessClassTicket extends baseTicket {
	
	private int baggageNum;
	private float frequentFlyerMiles;
	
	
	
	
	public businessClassTicket(double price, int ticketNumber, String origin, String destination, String customerID,
			int baggageNum, float frequentFlyerMiles) {
		super(price, ticketNumber, origin, destination, customerID);
		this.baggageNum = baggageNum;
		this.frequentFlyerMiles = frequentFlyerMiles;
		
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
	
	
	
	
	
}
