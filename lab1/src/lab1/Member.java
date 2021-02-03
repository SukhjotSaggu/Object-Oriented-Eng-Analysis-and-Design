/**
 * 
 */

/**
 * @author Sukhjot Saggu
 *
 */
public class Member extends Passenger{

int yearsOfMembership;

	public Member(String name, int age, int years) {
		super(name, age);
		this.yearsOfMembership = years;
	}

	public double applyDiscount(double p){
		if(this.yearsOfMembership > 5) {
			return (p*0.5);
		}
		else if(this.yearsOfMembership > 1 && this.yearsOfMembership <= 5) {
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
