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
public class Equals{

	public static void main(String[] args) {

		InitializationObject io1 = new InitializationObject("Object1");
		InitializationObject io2 = new InitializationObject("Object1");
		io1.setName("Bob");
		io2.setName("Bob");
		String s1 = "Hello";
		String s2 = "Hello";

		System.out.println(".........Testing String...............");
		if(s1 == s2)
			System.out.println("s1 == s2 true");
		else if (s1.equals(s2))
			System.out.println("s1.equals(s2) true");
		else
			System.out.println("s1 is NOT equal s2 ");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(".........Testing String...............");
		
		System.out.println(".........Testing Object...............");
		if(io1 == io2)
			System.out.println("io1 == io2 true");

		else if (io1.getNeme().equals(io2.getNeme()))
			System.out.println("io1.equals(io2) true");
		else
			System.out.println("io1 is NOT equal to io2");
		System.out.println(io1.getNeme().hashCode());
		System.out.println(io2.getNeme().hashCode());
		System.out.println(".........Testing Object...............");


		System.out.println(".........Testing HashMap...............");
		HashMap<InitializationObject, Integer> map = new HashMap<InitializationObject, Integer>();
		map.put(io1, 5);
		if(map.containsKey(io1)){
			System.out.println("containsKey true");
		} else {
			System.out.println("containsKey false");
		}
		System.out.println(".........Testing HashMap...............");
	}

}
