package config;
import java.sql.*;

public class Jdbcconnection {
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		
		//Datasource information
		/*String url="jdbc:h2:~/test";
		String username="sa";
		String password="";*/
		//Loading Driver
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		return conn;
	}

}