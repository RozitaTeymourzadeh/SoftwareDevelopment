/**
 * 
 */
package Thread;
import java.lang.Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class BlockingQueueTest {
	private static final int TEST_SIZE = 100000;
	
	public static void main(String[] args) {
		final CS601BlockingQueue<String> q = new CS601BlockingQueue<String>(4);
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0 ; i < TEST_SIZE*2; i++) {
					q.put("Value " + i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < TEST_SIZE; i++) {
					System.out.println(q.take());
				}
			}

		};
		
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < TEST_SIZE; i++) {
					System.out.println(q.take());
				}
			}

		};
		long start = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time " + (end-start));
	}
	

}
