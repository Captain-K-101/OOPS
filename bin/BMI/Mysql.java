package bmi;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;


 public class Mysql {
	void Insert(String a,double bmi) {
		try {
			
	Connection conn;
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","nik","password");
		Statement mys=conn.createStatement();
		String s="Insert into bmi(name,bmi) values('"+a+"',"+bmi+")";
		System.out.println(s);
		mys.executeUpdate(s);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

