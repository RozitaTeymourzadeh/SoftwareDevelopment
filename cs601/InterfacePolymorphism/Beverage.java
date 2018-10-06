/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public abstract class Beverage {
	protected int ounce = 5;
	public int getSize() {
		return this.ounce;
	}
	public void drink() {
		System.out.println("Bevarage: Mmm, tasty");
	}
	public abstract String getServingGlass();
}

