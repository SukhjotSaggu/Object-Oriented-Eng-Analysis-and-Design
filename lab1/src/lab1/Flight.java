/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
public class Flight {

int flightNumber, capacity, numberOfSeatsLeft;
String origin, destination, departureTime;
double originalPrice;
	
	public Flight() {
		flightNumber = 0;
		origin = "";
		destination = "";
		departureTime = "";
		numberOfSeatsLeft = 0;
		originalPrice = 0.0;
	}
	
	//put illegal argument exception
	//set number of seats left
	public Flight(int flightNumber, int capacity, String origin, String destination, String departureTime,
						Double originalPrice) {
		try {
				if(origin.equals(destination)) {
					throw new IllegalArgumentException("Origin and destination cannot be the same");
				}
				else {
					this.flightNumber = flightNumber;
					this.origin = origin;
					this.destination = destination;
					this.departureTime = departureTime;
					this.capacity = capacity;
					this.numberOfSeatsLeft = capacity;
					this.originalPrice = originalPrice;
				}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	public int getFlightNumber() {
		return this.flightNumber;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getNumberOfSeatsLeft() {
		return this.numberOfSeatsLeft;
	}
	
	public String getOrigin() {
		return this.origin;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public String getDepartureTime() {
		return this.departureTime;
	}
	
	public double getOriginalPrice() {
		return this.originalPrice;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
		this.numberOfSeatsLeft = numberOfSeatsLeft;
	}
	
	public void setOrigin(String origin) {
		try {
				if(origin.equals(destination)) {
					throw new IllegalArgumentException("Origin and destination cannot be the same");
				}
				else {
					this.origin = origin;
				}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
	
	public void setDestination(String destination) {
		try {
			if(destination.equals(origin)) {
				throw new IllegalArgumentException("Destination and origin cannot be the same");
			}
			else {
				this.destination = destination;
			}
	} catch (IllegalArgumentException e) {
		System.out.println(e);
	}
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	
	public boolean bookASeat() {
		if (this.numberOfSeatsLeft > 0 ) {
			this.numberOfSeatsLeft--;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return ("Flight " + this.flightNumber + ", " + this.origin + " to " + this.destination + ", " + this.departureTime + " original price: $" + this.originalPrice);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight test = new Flight(1030, 100, "Toronto", "Kolkata", "03/02/99 7:50 pm", 1000.00);
		
		System.out.println(test.toString());
	}

}
