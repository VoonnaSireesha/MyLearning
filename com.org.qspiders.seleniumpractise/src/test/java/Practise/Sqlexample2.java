package Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Sqlexample2 {

	public static void main(String[] args) throws SQLException {
		
		  //step 1 - Establish a connection with MySQL database
    	Driver driverRef = new Driver();
    	
    	DriverManager.registerDriver(driverRef);
    	
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","tiger");
        System.out.println("Connection is done");
    
    //step 2- create sql statement
              Statement stat =conn.createStatement();
        
    //step 3 - execute select query and get result 
      int  result = stat.executeUpdate("insert into country values('cid','india','Asia','Asia','456789');");
        		System.out.println(result);
       // while(resultset.next()) 
        	//System.out.println(resultset.getString(1));
    //step 4 - close the connection
        conn.close();
    
     
	}


	}


