/**
 * 
 */
package InterfacePolymorphism;

/**
 * @author rozitateymourzadeh
 *
 */
public abstract class Animal implements Comparable<Animal>{
	
	/* field */
	protected String name;
	protected String ownerName;
	
	/* constructor */
	public Animal(String name) {
		this.name = name;
	}
	
	/* getName */
	public String toString() {
		return name;
	}
	
	/* abstract speak */
	public abstract void speak();
	
	/* run */
	public void run() {
		System.out.println("Running ...");
	}
	
	/* compareTo */
	public int compareTo(Animal other) {
		return this.name.compareTo(other.name);
	}
}
