/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void speak() {
		System.out.print("Cat: Meow...");
	}
	public void sleep() {
		System.out.println("Cat: Sleeping ...");
	}
}
