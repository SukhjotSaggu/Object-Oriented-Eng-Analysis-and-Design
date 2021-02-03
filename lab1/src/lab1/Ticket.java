/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
public class Ticket {

Passenger passenger;
Flight flight;
double price;
static int number;

	public Ticket(Passenger p, Flight flight, double price) {
		this.passenger = p;
		this.flight = flight;
		this.price = price;
		number++;
	}
	
	public void setPassenger(Passenger p) {
		this.passenger = p;
	}
	
	public void setFlight(Flight f) {
		this.flight = f;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
		
	public Passenger getPassenger() {
		return this.passenger;
	}
	
	public Flight getFlight() {
		return this.flight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	@Override
	public String toString() {
		return (this.passenger.getName() + ", " + flight.toString() + ", actual price $: " + this.price);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
