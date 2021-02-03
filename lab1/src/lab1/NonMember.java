/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
public class NonMember extends Passenger{

	public NonMember(String name, int age) {
		super(name, age);
	}
	
	double applyDiscount(double p) {
		if(super.getAge() > 65) {
			return (p*0.9);
		}
		return p;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
