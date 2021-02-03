/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
abstract class Passenger {
	
String name;
int age;

	public Passenger() {
		this.name = "";
		this.age = 0;
	}
	
	public Passenger(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	abstract double applyDiscount(double p);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
