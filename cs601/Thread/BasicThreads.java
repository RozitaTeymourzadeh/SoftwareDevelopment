/**
 * 
 */
package Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class BasicThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiate a runnable object
		//pass the runnable to a Thread object
//		InfinitePrinter p1 = new InfinitePrinter();
		Thread t1 = new Thread(new InfinitePrinter());

//		InfinitePrinter p2 = new InfinitePrinter();
		Thread t2 = new Thread(new InfinitePrinter());

		//Start the Thread
		t1.start();
		t2.start();

		/* TBD: using join */
//		try {
//			t1.join();
//			t2.join();
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Finished");
	}

}

