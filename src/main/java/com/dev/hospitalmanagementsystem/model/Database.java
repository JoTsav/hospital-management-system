package com.dev.hospitalmanagementsystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
public class Database {

    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver" /** jdbc:mysql://localhost:3306/hospitalmanagementsystem */);
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem", "root", "");
            return connect;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
