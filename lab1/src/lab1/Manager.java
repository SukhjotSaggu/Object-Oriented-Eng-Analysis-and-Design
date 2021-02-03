import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
public class Manager {

ArrayList <Flight> flights = new ArrayList<Flight>();
ArrayList <Ticket> issuedTickets = new ArrayList<Ticket>();


	public void createFlights() {
		
		flights.add(new Flight (1030, 4, "Toronto", "Kolkata", "03/02/99 7:50pm", 1100.00));
		flights.add(new Flight (130, 90, "Kolkata", "Toronto", "04/06/99 8:50am", 1000.00));
		flights.add(new Flight (103, 80, "Miami", "Dalas", "06/06/99 10:40pm", 510.00));
		flights.add(new Flight (100, 100, "New York", "Sydney", "02/04/99 6:50am", 1400.00));
		
	}
	
	public void displayAvalibleFlights(String origin, String destination) {
		for(int i=0;i < flights.size();i++) {
			if(flights.get(i).getOrigin() == origin && flights.get(i).getDestination() == destination && flights.get(i).getNumberOfSeatsLeft() > 0) {
				System.out.println(flights.get(i).toString());
			}
		}
	}
	
	public Flight getFlight(int flightNumber) {
		Flight returnFlight = null;		
		for(int i=0;i < flights.size();i++) {
			if(flights.get(i).getFlightNumber() == flightNumber) {
				returnFlight = flights.get(i);
				System.out.println(flights.get(i).toString());
				returnFlight= flights.get(i);
			}
		}
		return returnFlight;
	}
	
	public void bookSeat(int flightNumber, Passenger p) {
		for(int i=0;i < flights.size();i++) {
			if(flights.get(i).getFlightNumber() == flightNumber) {
				if(flights.get(i).bookASeat() == true) {
					issuedTickets.add(new Ticket(p, flights.get(i), p.applyDiscount(flights.get(i).getOriginalPrice())));
					System.out.println("Seat Successfully Booked");
					System.out.println(issuedTickets.get(issuedTickets.size()-1).toString());
				}
				else if(flights.get(i).bookASeat() == false) {
					System.out.println("Seats Fully Booked");
				}
			}
		}

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager mOne = new Manager();
		Passenger pOne = new Member("Sam", 40, 6);
		Passenger pTwo =  new NonMember("John", 70);
		Passenger pThree =  new NonMember("Harry", 30);
		Passenger pFour =  new Member("Rose", 68, 2);
		Passenger pFive =  new Member("Meg", 30, 1);
		mOne.createFlights();
		mOne.displayAvalibleFlights("Toronto", "Kolkata");
		mOne.displayAvalibleFlights("Kolkata", "Toronto");
		mOne.displayAvalibleFlights("Miami", "Dalas");
		mOne.displayAvalibleFlights("New York", "Sydney");
		mOne.getFlight(103);
		mOne.bookSeat(1030, pOne);
		mOne.bookSeat(1030, pTwo);
		mOne.bookSeat(1030, pThree);
		mOne.bookSeat(1030, pFour);
		mOne.bookSeat(1030, pFive);
		mOne.bookSeat(103, pFive);
	}

}
