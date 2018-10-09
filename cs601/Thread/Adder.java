/**
 * 
 */
package Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class Adder {

	/**
	 * @param args
	 */
	int value = 0;
	public synchronized void increment() {
		value++;
	}
	public static void main(String[] args) {

		final Adder a = new Adder();

		Thread t1 = new Thread() {
			public synchronized void run() {
//			public void run() {
				for(int i = 0 ; i < 30000; i++) {
					synchronized(a) {
					a.value++;
					}
//					a.increment();
				}
				System.out.println("thread 1 complete");
			}
		};
		Thread t2 = new Thread() {
			public synchronized void run() {
//			public void run() {
				for(int i = 0; i < 30000 ; i++) {
					synchronized(a) {
					a.value++;
					}
//					a.increment();
				}
				System.out.println("thread 2 complete");
			}
		};
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a.value);
	}
}
