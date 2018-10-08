/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public class Tiger extends Animal{
	private String name;
	public Tiger(String name) {
		super(name);
	}
	public String getName() {
		return name;
	}
	public void scratch() {
		;
	}
	public void speak() {
		System.out.println("Tiger: Roar!");
	}
}
