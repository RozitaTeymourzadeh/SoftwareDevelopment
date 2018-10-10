/**
 * 
 */
package Thread;

/**
 * @author rozitateymourzadeh
 *
 */
public class CS601BlockingQueue<T> {
	
	private T[] items;
	private int start;
	private int end;
	private int size;
	
	public CS601BlockingQueue(int size){
		this.items = (T[]) new Object[size];
		this.start = 0;
		this.end = -1;
		this.size = 0;
	}

	public synchronized void put(T item) {
		if (size == items.length) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
		// Wrong statement ,take a lot CPU
		while(size == items.length) {
			;
		}
		
		int next = (end+1)%items.length;
		items[next] = item;
		end = next;
		size ++;
		if(size == 1) {
			this.notifyAll();
		}
	}
	
	public synchronized T take() {
		
		while(size == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		T item = items[start];
		start = (start + 1)%items.length;
		size--;
		if(size == items.length-1) {
		this.notifyAll();
		}
		return item;
	}
	
	public synchronized boolean isEmpty() {
		return size == 0;
	}
}
