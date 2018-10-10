/**
 * 
 */
package Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class InfinitePrinter implements Runnable {
	private String prefix;
	private boolean running;
	
	public InfinitePrinter(String prefix, Boolean running) {
		this.prefix = prefix;
		this.running = true;
	}
	
	public InfinitePrinter() {
//		this("default");
	}

	@Override
	public void run() {
		// main jaob execute in this thread
		// this will execute when thread start method is invoked
		
		int count = 1;
		while(running && count < Integer.MAX_VALUE) {
			System.out.println(prefix + "_" + count++);
		}
		
	}

}
