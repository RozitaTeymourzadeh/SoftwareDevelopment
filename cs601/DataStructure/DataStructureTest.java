/**
 * 
 */
package DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList vs ArrayList
 * @author rozitateymourzadeh
 *
 */
public class DataStructureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// run the data in method and call it from main make it faster process
		// first iteration takes longer time and last iteration is faster from 23 ms down to 7 ms
		// when we add only 1 element in List, list.add(i), the performance for ArrayList and LinkedList are kind
		// of same, however the time significantly increases when it comes to list.add(0,i) in ArrayList
		System.out.println("LinkedListTest");
		for(int i = 0; i < 5; i++) {
			runTest(new LinkedList<Integer>());
		}
		
		System.out.println("ArrayListTest");
		for(int i = 0; i < 5; i++)
			runTest(new ArrayList<Integer>());
	}

	public static void runTest(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 200000; i++) {
//			list.add(i);
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time is: " + (end - start));
	} 

}
