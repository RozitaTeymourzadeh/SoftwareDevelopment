/**
 * 
 */
package Thread.printer.thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class InfinitePrinter implements Runnable {
	private String prefix;
	private boolean running;
	 
	public InfinitePrinter(String prefix) {
		this.prefix = prefix;
		this.running = true; 
	}
	
	public InfinitePrinter() {
		this("default");
	}

	@Override
	public void run() {
		// main jab execute in this thread
		// this will execute when thread start method is invoked
		
		int count = 1;
		while(running && count < 100) {
			System.out.println(prefix + "_" + count++);
		}
		
	}

}
