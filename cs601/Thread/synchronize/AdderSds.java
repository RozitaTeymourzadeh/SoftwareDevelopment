/**
 * 
 */
package Thread.synchronize;

/**
 * @author rozitateymourzadeh
 *
 */
public class AdderSds {
	private int value = 0;
	public void increment(){
		synchronized(this) {
			// step 1
            // step 2		
			value++;
			// step 3
			//step 4
		}
	}
	
	public void updateValue(int n) {
		int toUpdate = (n+value)*2;
		
		synchronized(this) {
			value += toUpdate;
		}
	}
}
