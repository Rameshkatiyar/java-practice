package com.tech.jdbc;

import java.sql.*;

public class TestJdbc {

    public void connectToDB() throws ClassNotFoundException, SQLException {
        //STEP 1: Register driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //STEP 2: Get Connection
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ioJava","password");

        //STEP 3: Create statement
        Statement stmt=con.createStatement();

        //STEP 4: Execute query
        ResultSet rs=stmt.executeQuery("select * from emp");

        //STEP 5: Process Result
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        //STEP 6: Close connection
        con.close();
    }
}
