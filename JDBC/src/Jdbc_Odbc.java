import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

/*
 * This application will connect to Oracle database, you can retrieve data from its RDBMS
 * DriverManager.setLogStream() causes any loggin to be done to the standard error
 * Connection object getWarning() prints any addition warning that come up.
	M.Brohi
 */ 



public class Jdbc_Odbc {

	
	
	public static void main(String[] args) {
		
	String dbURL = "jdbc:odbc:Companies"; 	
		//URL bridge to ORACLE Microsoft included in a JDK
	try {
		
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

	DriverManager.setLogWriter(new PrintWriter((System.err)));
	System.out.println("Getting Connection");
	
	Connection conn =
			DriverManager.getConnection(dbURL, "user", "password"); 
	//User Password to access the SQL Database
	
	SQLWarning warn = conn.getWarnings();
	while (warn != null) {
		
		System.out.println("SQLState" + warn.getSQLState());
		System.out.println("Message:  " + warn.getMessage());
		System.out.println("Vendor: " + warn.getErrorCode());
		
		System.out.println("");
		
		warn = warn.getNextWarning();
	}
	//Connection close
			conn.close();
	} catch (ClassNotFoundException e) {
		
		System.out.println("Can't load driver" + e);
	} catch (SQLException e) {
		System.out.println("Database Access Failed" + e);
	
	
	}
	
}
}

