/**
 * 
 */
package InterfacePolymorphism;

/**
 * 
 * Student and Human class
 * @author rozitateymourzadeh
 *
 */

class Student extends Human {
	protected String ID;
	protected String name;
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	public String getName() {
		return name+":"+ID;
	}
}
