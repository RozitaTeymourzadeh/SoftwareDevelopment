/**
 * 
 */
package Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class SharedDataExample {

	/**
	 * @param args
	 */ 

	public static void main(String[] args) {
		SharedDataStructure sds= new SharedDataStructure();
		Thread t1 = new Thread(new Workers(sds));
		Thread t2 = new Thread(new Workers(sds));

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sds.size());
	}
}
