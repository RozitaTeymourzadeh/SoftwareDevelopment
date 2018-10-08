/**
 * 
 */
package src;

import java.util.HashMap;

import Initialization.InitializationObject;


/**
 * 
 * To check String properties for equals
 * @author rozitateymourzadeh
 *
 */
public class Equals {
	public static void main(String[] args) {
		InitializationObject io1 = new InitializationObject("Object1");
		InitializationObject io2 = new InitializationObject("Object1");
		/*...HashCode are different ....*/
		System.out.println(io1.hashCode());
		System.out.println(io2.hashCode());
		
		System.out.println("........................");
		if(io1 == io2)
			System.out.println("io1 == io2 true");
		else if (io1.equals(io2))
			System.out.println("io1.equals(io2) true");
		else
			System.out.println("false");
		System.out.println("........................");
		
		HashMap<InitializationObject, Integer> map = new HashMap<InitializationObject, Integer>();
		map.put(io1, 5);
		if(map.containsKey(io2)){
			System.out.println("containsKey true");
		} else {
			System.out.println("containsKey false");
		}
	}

}
