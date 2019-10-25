package oopsfinal;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



 public class Mysql {
	 
	 Connection conn1;
	void Insert(String a,String cs) {
		try {

		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi","nik","password");
		Statement mys=conn1.createStatement();
		String s="Insert into bmi(username,password) values('"+a+"','"+cs+"')";
		System.out.println("SUCCESS");
		mys.executeUpdate(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void bmiInsert(String f) {
		try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi","nik","password");
		Statement mys=conn1.createStatement();
		String s="Insert into bmi_values(bmi) values('"+f+"')";
		System.out.println(s);
		mys.executeUpdate(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	int Login(String a,String b) {
		try {

			System.out.println("asd");
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi","nik","password");
				Statement mys=conn1.createStatement();
				String s="select *  from bmi where username='"+a+"' and password ='"+b +"'";
				System.out.println(s);
			    ResultSet rs=mys.executeQuery(s); 
			    while(rs.next()) {
			    if(rs.getString(1).equals(a) && rs.getString(2).equals(b)){
			       return 1;
			    }
			    else{
			       return 0;
			    }
			    }
				
				}catch(Exception e) {
					e.printStackTrace();
				}
		return 0;
			}
String getbmi() {
		try {

			System.out.println("asd");
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/bmi","nik","password");
				Statement mys=conn1.createStatement();
				String s="select *  from bmi_valuse LIMIT 0,2";
				System.out.println(s);
			    ResultSet rs=mys.executeQuery(s); 
			    String s1=String.valueOf(rs);
			    return s1;
				}catch(Exception e) {
					e.printStackTrace();
				}
		return "0";
	}
 }
