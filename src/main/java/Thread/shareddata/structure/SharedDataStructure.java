/**
 * 
 */
package Thread.shareddata.structure;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * @author rozitateymourzadeh
 *
 */
// Study these concept : lock() / tryLock() / ReentrantReadWriteLock()
public class SharedDataStructure {

	private ConcurrentHashMap<Integer, String> values;
	private ReentrantReadWriteLock rwl;

	public SharedDataStructure() {
		this.values = new ConcurrentHashMap<Integer, String>();// ConcurrentHashMap is threadSafe
		this.rwl = new ReentrantReadWriteLock();
	}

	// Write Method
	public void addValue(int number, String string) {
		this.rwl.writeLock().lock();
		this.values.put(number,  string);
		this.rwl.writeLock().unlock();
	}

	//read method
	public int size() {
		try{
			this.rwl.readLock().lock();
			return this.values.size();
		} finally {
			this.rwl.readLock().unlock();
		}
	}
}
