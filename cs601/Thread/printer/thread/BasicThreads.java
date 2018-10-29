/**
 * 
 */
package Thread.printer.thread;

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
		InfinitePrinter p1 = new InfinitePrinter("T1");
		Thread t1 = new Thread(p1);

		InfinitePrinter p2 = new InfinitePrinter("T2");
		Thread t2 = new Thread(p2);

		//Start the Thread
		t1.start();
		t2.start();
		

		/* TBD: using join */
//		 Test the program with join and without join and observe the differences
//		if we dont join the thread,  the job wont be finished and "Finished" word wont be appears
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
}

