/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */

class Human {
	String name;
	public String getName() {
		return name;
	}
	public String getInfo() {
		return getName();
	}
}
