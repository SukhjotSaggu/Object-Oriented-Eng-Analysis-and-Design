import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;



public class FlightTest {
	
	Flight f3 = new Flight(100, 150, "New York", "Sydney", "03/02/99 7:50 pm", 1000.00);

	@Test
	public void testConstructor() {
		Flight f1 = new Flight(1030, 100, "Toronto", "Kolkata", "03/02/99 7:50 pm", 1000.00);
	}
	
	@Test
	public void testInvalidConstructor() {
		Flight f2 = new Flight(1030, 100, "Toronto", "Toronto", "03/02/99 7:50 pm", 1000.00);	
	}

	@Test
	public void testGetFlightNumber() {
		assertEquals(100, f3.getFlightNumber());
		System.out.println("getFlightNumber() Pass");
	}

	@Test
	public void testGetCapacity() {
		assertEquals(150, f3.getCapacity());
		System.out.println("getCapacity() Pass");
	}

	@Test
	public void testGetNumberOfSeatsLeft() {
		assertEquals(150, f3.getNumberOfSeatsLeft());
		System.out.println("getNumberOfSeatfLeft() Pass");
	}

	@Test
	public void testGetOrigin() {
		assertEquals("New York", f3.getOrigin());
		System.out.println("getOrigin() Pass");
	}

	@Test
	public void testGetDestination() {
		assertEquals("Sydney", f3.getDestination());
		System.out.println("getDestination() Pass");
	}

	@Test
	public void testGetDepartureTime() {
		assertEquals("03/02/99 7:50 pm", f3.getDepartureTime());
		System.out.println("getDepartureTime() Pass");
	}

	@Test
	public void testGetOriginalPrice() {
		double num = f3.getOriginalPrice();
		assertEquals(1000.00, num, 0.1);
		System.out.println("getOriginalPrice() Pass");		
	}

	@Test
	public void testSetFlightNumber() {
		f3.setFlightNumber(200);
		assertEquals(200, f3.getFlightNumber());
		System.out.println("setFlightNumber() Pass");
	}

	@Test
	public void testSetCapacity() {
		f3.setCapacity(50);
		assertEquals(50, f3.getCapacity());
		System.out.println("setCapacity() Pass");
	}

	@Test
	public void testSetNumberOfSeatsLeft() {
		f3.setNumberOfSeatsLeft(6);
		assertEquals(6, f3.getNumberOfSeatsLeft());
		System.out.println("setNumberOfSeatfLeft() Pass");
	}

	@Test
	public void testSetOrigin() {
		f3.setOrigin("Florida");
		assertEquals("Florida", f3.getOrigin());
		System.out.println("setOrigin() Pass");
	}

	@Test
	public void testSetDestination() {
		f3.setDestination("California");
		assertEquals("California", f3.getDestination());
		System.out.println("setDestination() Pass");	
	}

	@Test
	public void testSetDepartureTime() {
		f3.setDepartureTime("02/07/15 10:30 am");
		assertEquals("02/07/15 10:30 am", f3.getDepartureTime());
		System.out.println("setDepartureTime() Pass");
	}

	@Test
	public void testSetOriginalPrice() {
		f3.setOriginalPrice(500.00);
		double num = f3.getOriginalPrice();
		assertEquals(500.00, num, 0.1);
		System.out.println("setOriginalPrice() Pass");	
	}

	@Test
	public void testBookASeat() {
		assertEquals(f3.bookASeat(), true);
		System.out.println("testBookASeat() Pass");
	}

	@Test
	public void testToString() {
		assertEquals("Flight 100, New York to Sydney, 03/02/99 7:50 pm original price: $1000.0", f3.toString());
		System.out.println("toString() Pass");
	}

}
