/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public class RunTestHuman {
	public static void main(String[] args) {
		Student s = new Student("Madonna","111-22-3333");
		Human h = s;
		System.out.println(s.getName().toString());
		System.out.println(h.getName().toString());
		System.out.println(s.getInfo().toString());
		System.out.println(h.getInfo().toString());
	}

}
