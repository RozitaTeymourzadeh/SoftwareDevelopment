package InterfacePolymorphism;

public class RunTestBeverage {

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
//Polymorphism
		Beverage[] brev = new Beverage[3];
		brev[0] = new Coffee(false);
		brev[1] = new Coffee(true);
		
//Exercise of Inheritance section		
		System.out.println("Start...");
		Beverage c1 = new Coffee(true);
		Coffee c2 = new Coffee(false);
		c1.drink();
		c2 =(Coffee) c1;
		c2.drink();
		
		
		
	}

}
