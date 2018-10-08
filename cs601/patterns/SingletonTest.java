/**
 * 
 */
package patterns;

import patterns.Singleton;

/**
 * @author rozitateymourzadeh
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton.singletonMethod();
	}

}
