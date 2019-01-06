package jdbc;

//https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCPreparedStatementExample {

	public static void main(String[] args) throws SQLException {
		String username  = "user35";
		String password  = "user35";
		String db  = "user35";

		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		}
		catch (Exception e) {
			System.err.println("Can't find driver");
			System.exit(1);
		}

		// format "jdbc:mysql://[hostname][:port]/[dbname]"
		//note: if connecting through an ssh tunnel make sure to use 127.0.0.1 and
		//also to that the ports are set up correctly

		String urlString = "jdbc:mysql://sql.cs.usfca.edu/"+db;
		//Must set time zone explicitly in newer versions of mySQL.
		String timeZoneSettings = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


		Connection con = DriverManager.getConnection(urlString+timeZoneSettings,
				username,
				password);
		String selectStmt = "SELECT * FROM customers"; 
		
		//create a statement object
		PreparedStatement stmt = con.prepareStatement(selectStmt);
		
		//execute a query, which returns a ResultSet object
		ResultSet result = stmt.executeQuery();

		//iterate over the ResultSet
		while (result.next()) {
			//for each result, get the value of the columns name and id
			String nameres = result.getString("name");
			int idres = result.getInt("id");
			System.out.printf("name: %s id: %d\n", nameres, idres);
		}

		String name = "Sue";
		int id = 9456;
		
		PreparedStatement updateStmt = con.prepareStatement("INSERT INTO customers (name, id) VALUES (?, ?)");
		updateStmt.setString(1, name);
		updateStmt.setInt(2, id);
		updateStmt.execute();
		
		//reuse the statement to insert a new value into the table
		System.out.println("\n***\n");		

		//print the updated table
		result = stmt.executeQuery();
		
		while (result.next()) {
			String nameres = result.getString("name");
			int idres = result.getInt("id");
			System.out.printf("name: %s id: %d\n", nameres, idres);
		}

		con.close();
	}
}