package src;
/**
 * Overload definition versus Override definition
 * https://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/
 */
public class OverrideVsOverload {
	
	/**
	 * 
	 * Run the extended class
	 * 
	 */
	public void callDog(){
		Dog lucy = new Dog();
		Hound shelman = new Hound();
		Dog tinny = new Hound();
		shelman.bark();
		shelman.bark(5);
		shelman.sniff();
		lucy.bark(4);
		lucy.bark();
		tinny.bark();
		tinny.bark(3);
	};
	
	public static void main(String[] args) {
		OverrideVsOverload run = new OverrideVsOverload();
		run.callDog();
	}
}

/**
 * 
 * Overload method example
 * 
 */
class Dog{
	
	public void bark() {
		System.out.println("Dog ");
	}
	// Overload (Same method name and different parameter)
	public void bark(int num) {
		for(int i = 0; i < num ; i++) {
			System.out.println("Dog Dog ");
		}
	}
}

/**
 * 
 * Override method in extended class
 * 
 */
class Hound extends Dog{
	
	public void sniff() {
		System.out.println("Hound Sniff ");
	}
	// extended version of parent method that is override
	// Override same method name and the same parameter
	@Override
	public void bark() {
		System.out.println("Hound Bark ");
	}
}



