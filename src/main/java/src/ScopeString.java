package src;

public class ScopeString {

	private String first;
	
	public ScopeString (String first) {
		this.first = first;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getFirst(){
		return this.first;
	}
	
	public boolean equals(ScopeString other){
		return this.first.equals(other.getFirst());
	}
	
	private static void ChangeName(ScopeString n) {
		n.setFirst("Bob");
	}
	
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		/* return false */
		System.out.println(s1 == s2);
		/* return true */
		System.out.println(s1.equals(s2));
		
		ScopeString n1 = new ScopeString("Bob");
		ScopeString n2 = new ScopeString("Bob");
		/* return false */
		System.out.println(n1 == n2);
		/* return true */
		System.out.println(n1.equals(n2));
		
		/*Static*/
		ScopeString d1 = new ScopeString("Rozita");
		ChangeName(d1);
		System.out.println(d1.getFirst());
	}

}
