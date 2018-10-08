/**
 * 
 */
package patterns;

/**
 * Singleton: A class o which only a single instance can exist. 
 * @author rozitateymourzadeh
 *
 */
public class Singleton {
	
	private static Singleton instance;
	
	public static Singleton getInstance(){
	if (instance == null)
		instance = new Singleton();
		return instance;
	}
	
	private Singleton() {
		System.out.println("Singleton<init>");
	}
	
	public static void singletonMethod() {
		System.out.println("Singleton.singletonMethod");
	}
	
	private static class SingletonHolder{
		private static final Singleton INSTANCE = new Singleton();
	}
	
}
