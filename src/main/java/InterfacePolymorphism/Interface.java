/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public class Interface{
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CanFly f;
		Airplane a = new Airplane();
		Bird b = new Bird();
		FlyingSquirrel s = new FlyingSquirrel();

		f = a;
		f = b;
		//				f = s;
		f = (CanFly)s;
		//				a = b;

	}

}


interface CanFly {
	public void fly();
}

class Airplane implements CanFly {
	public void fly() {
		System.out.println("Airplane");
	}
}

class Bird implements CanFly {
	public void fly() {
		System.out.println("Bird");
	}
}

class FlyingSquirrel {
	public void fly() {
		System.out.println("FyingSquirrel");
	}
}

