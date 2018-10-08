package src;

public class StaticEmployee {
	String ID = "5";
	static String companyName;
	public static void setCompanyName(String n) {
		companyName = n;
	}
	public String getID() {
		return ID;
	}

	public static void main(String[] args) {
		StaticEmployee employee = new StaticEmployee();
		System.out.println(employee.getID());
		
// Wrong access as accessing non static obj with static method
//		employee.setCompanyName("Neonode");
		StaticEmployee.setCompanyName("Neonode");
		;
		

	}

}
