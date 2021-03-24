
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Test Data for Lbs_mail BLOB application 
 * @author elianeiselt
 *
 */
public class ExampleData {
	
	private final String url = "jdbc:mysql://localhost:3306/"; 	
	private String user = "root";
	private String password = "Legolas17";
	private String db = "mail"; 		
	private String command;
	
	
	public static void main(String args[])  {	
		
	}
	
	// convert pdf to binary
	//write data into database
	private static void writeData() {
		
	}
	
	//getter / setter
	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getDb() {
		return db;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		 this.command = command;
	}

}
