/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee_Shop_Management_System;

import java.sql.*;

/**
 *
 * @author Nahiyan H Khan
 */
public class db {
    Connection c;
    Statement s;
    
    public db(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/coffee_shop", "root", "");
            s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
