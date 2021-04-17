package come.learnDev.mySQLconnection;

import java.sql.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {
 public static void main(String[] args) throws ClassNotFoundException {
	
	try {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml has been loaded");
		Connection connection = context.getBean("connection",Connection.class);
		connection.displayDetails();
		
		 java.sql.Connection conn = DriverManager.getConnection(
				 connection.getConnURL().concat("/").concat(connection.getDbName()),
				connection.getUsername(),connection.getPassword());
		if(conn!=null) {
			System.out.println("connected to mySchema");
		}
		
		Statement stmt=conn.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getString(2));  
		
		conn.close();  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
}
}
