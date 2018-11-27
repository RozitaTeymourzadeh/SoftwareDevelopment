/**
 * Coffee is extended class of Beverage supper class
 */
package InterfacePolymorphism;

/**
 * Coffee class 
 * @author rozitateymourzadeh
 *
 */
public class Coffee extends Beverage{

	protected boolean isDecaf;
	
	/**
	 * Constructor
	 * Set isDecaf
	 */	
	public Coffee(boolean isDecaf) {
		this.isDecaf = isDecaf;
	}

	@Override
	public String getServingGlass() {
		return "Cup";
	}
	
	public boolean isDecaf() {
		return this.isDecaf;
	}
	@Override
//	partial override
	public void drink() {
		super.drink();
		System.out.println("Coffee: Wow, thats hot");
	}

}

