package come.learnDev.mySQLconnection;

import org.springframework.beans.factory.annotation.Value;

public class Connection {

 private String username;
 private String password;
 private String connURL;
 private String dbName;
 @Value("${mysql.username}")
public void setUsername(String username) {
	this.username = username;
}
 @Value("${mysql.password}")
public void setPassword(String password) {
	this.password = password;
}
 @Value("${mysql.connURL}")
public void setConnURL(String connURL) {
	this.connURL = connURL;
}
 @Value("${mysql.dbName}")
public void setDbName(String dbName) {
	this.dbName = dbName;
}
 
public void displayDetails() {
	
	System.out.println("connection properites are set as "
			+" username " + username
			+" password " + password
			+" database " + dbName
			+" connectionURL " + connURL
			);
}
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getConnURL() {
	return connURL;
}
public String getDbName() {
	return dbName;
}
}
