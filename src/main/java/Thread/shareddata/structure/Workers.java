/**
 * 
 */
package Thread.shareddata.structure;
import java.util.ArrayList;
/**
 * @author rozitateymourzadeh
 *
 */
public class Workers implements Runnable{

	private SharedDataStructure sds;
	
	public Workers(SharedDataStructure sds) {
	}

	@Override
	public void run() {  
		for(int i = 0; i < 100; i++) {
			this.sds.addValue(i, "Value: " + i);
		}
	} 
}
