
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Test Data for Lbs_mail BLOB application.
 * @author elianeiselt
 *
 */
public class ExampleData {
	
	private  static final String url = "jdbc:mysql://localhost:3306/"; 	
	private static String user = "root";
	private static String password = "Legolas17";
	private static String db = "mail"; 		
	private static String command;
	
	
	public static void main(String args[])  {	
		
		// try and catch db connection 
				try {
					
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					
					// db connection
					Connection connection = DriverManager.getConnection(getUrl(), getUser(), getPassword());
					System.out.println("Verbindung zur DB hergestellt!");
					
					// choosing table
					Statement statement = connection.createStatement();
					statement.execute("USE" + " " + getDb());
					System.out.println("Auswahl der DB erfolgt!");
					
					// 
					Statement sql = connection.createStatement();
		            //String data = "INSERT INTO lbs_mail"
		            //				+ " (last_name, first_name, email)"
		            //				+ " VALUES ('Brown', 'David', 'david.brown@foo.com')";

		            //sql.executeUpdate(data);

		            System.out.println("Insert complete");
					
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
				
				}
				
				
	}
	
	// convert pdf to binary
	//write data into database
	private static void writeData() {
		
	}
	
	//getter / setter
	public static String getUrl() {
		return url;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDb() {
		return db;
	}

	public static String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		 this.command = command;
	}

}
