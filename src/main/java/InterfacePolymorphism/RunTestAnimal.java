/**
 * 
 */
package InterfacePolymorphism;

import java.util.ArrayList;
import java.util.Collections;

/**
 * To test Dog, Cat and Animal Class
 * @author rozitateymourzadeh
 *
 */
public class RunTestAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(new Dog("Fido"));
		zoo.add(new Cat("Lucy"));
		zoo.add(new Cat("Oreo"));
		zoo.add(new Cat("Nitty"));
		zoo.add(new Cat("Catti"));
		zoo.add(new Dog("Betti"));
		zoo.add(new Cat("Roze"));
		zoo.add(new Dog("Amanda"));
		zoo.add(new Cat("Jeff"));
		
		for(Animal a: zoo) {
			// Whats happen if we changed it to 
			// if(a instance of Comparable)
			if(a instanceof Cat) {
				Cat c = (Cat)a;
				c.sleep();
			} else {
				System.out.println("Dogs don't sleep...");
			}
		}
System.out.println("\n*********Sorted*********");
		Collections.sort(zoo);
		System.out.println(zoo.get(0).toString());
		for (Animal a: zoo) {
			System.out.println(a);
		}
		
		/*Question 4 OOPW page*/
		// Error on static reference to non static method
		//String n = Tiger.getName();
		
		/*Question 6 OOPW page*/
		  Animal a;
		  Dog d = new Dog("Lucy");
		  Cat c = new Cat("Catti");
		  

		  a = d; // Dog and Cat can be assigned to Animal without casting
		  a = (Animal)d; // Dog and Cat can be assigned to Animal without casting/casting is optional
//		  d = a; // Animal can not be assigned in Dog and Cat unless casting
		  d = (Dog) a; // Animal can be casted to Dog and Cat to be assigned
//		  c = d; // Dog type can not be assigned in Cat type
//		  d = c; // Cat type can not be assigned in Dog type
	}

}
