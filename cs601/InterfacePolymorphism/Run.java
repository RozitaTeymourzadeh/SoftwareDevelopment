package InterfacePolymorphism;

public class Run {

	public static void main(String[] args) {
		
		Coffee c = new Coffee(false);
		System.out.println(c.getSize());
		
// Error! 	: Abstract class of Beverage can not be instantiated.
//		Beverage b = new Beverage();
//		System.out.println(b.getSize()); 

		
		Beverage b = new Coffee(false);
//Error! is Decaf is not define in Beverage type
//		System.out.println(b.isDecaf());
		
		Beverage d = new Coffee(false);
		d.drink();
		
		Beverage e = new Coffee(false);
		System.out.println(e.getServingGlass());
	}

}
