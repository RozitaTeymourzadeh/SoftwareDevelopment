/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.println("Dog: Woof ...");
	}

}
