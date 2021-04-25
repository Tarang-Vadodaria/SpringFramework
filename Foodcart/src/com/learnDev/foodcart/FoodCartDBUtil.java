package com.learnDev.foodcart;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {

	 ArrayList<FoodPOJO> foodItems = new ArrayList<FoodPOJO>();
public  ArrayList<FoodPOJO> connect() throws ClassNotFoundException {
	
	 Class.forName("com.mysql.jdbc.Driver");
	 String connURL = "jdbc:mysql://localhost:3306";
	 String DbName = "mySchema";
	 String Username = "root";
	 String Password ="*********";
	 
	 try {

		 java.sql.Connection conn = DriverManager.getConnection(
				 connURL +"/"+ DbName,
				 Username,Password);
		if(conn!=null) {
			System.out.println("connected to mySchema");
		}
		
		Statement stmt=conn.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from menu");
		while(rs.next()){
			
		int id = rs.getInt(1);
		String item = rs.getString(2);
		int price = rs.getInt(3);
		FoodPOJO POJOitem = new FoodPOJO();
		POJOitem.setId(id);
		POJOitem.setItem(item);
		POJOitem.setPrice(price);
		foodItems.add(POJOitem);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return foodItems;
	}
}
