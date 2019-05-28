import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.io.IOException;



public class Querydb {

	
	public static void main(String[] fn) {
	
		throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName(JDConstants.getProperty("jabadot.jabadb.driver"));
		
		System.out.println("Getting Connection");
		Connection conn = DriverManager.getConnection(
				JDConstants.getProperty("jabadot.dburl"));
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(
				"Select * from jabadb where name = 'name'"); {
					
					String name = rs.getString(1);
					String fullName = rs.getString(3);
					
				System.out.println("User" + name +"is named" + fullName);	
					
					}
				rs.close();
				stmt.close();
				conn.close();
				System.exit(0);
		
				
	}

	}

}
