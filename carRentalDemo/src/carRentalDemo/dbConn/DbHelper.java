package carRentalDemo.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	private String dbUrl = "jdbc:sqlite://d:/dbSample/CarRental.db";
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl);
	}
	
	public void showErrorMessage(SQLException sqlException) throws Exception {
		throw new Exception("Error : " + sqlException.getMessage() + "\n" + "Error Code : " + sqlException.getErrorCode());		
	}
	
	public static void dbConnectHelper() {
	    
	}

}
