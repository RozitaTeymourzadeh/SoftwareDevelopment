/**
 * 
 */
package Initialization;

/**
 * @author rozitateymourzadeh
 *
 */
public class InitializationObject {
	
	public InitializationObject(String msg) {
		System.out.println("InitializationObject constructor " + msg);
	}
	
	private String name;
	public void setName(String msg) {
		this.name = msg;
	}
	
	public String getNeme() {
		return name;
	}

	public boolean equals(InitializationObject anotherObj) {
		if (anotherObj.name == null) 
			return false;
	    if (this.name.equals(anotherObj.name))
	    	return true;
	    else
	    	return false;
	}
}
