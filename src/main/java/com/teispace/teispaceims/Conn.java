/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teispace.teispaceims;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author krish
 */
public class Conn {
    public Connection connection;
    public java.sql.Statement statement;

    public Conn(){
        String userName = "root"; // username of database
        String pass = ""; // password of database
        String url = "jdbc:mysql://localhost:3306/TeiSpaceIMS?serverTimezone=UTC"; //connection link to database/database_name
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,pass);
            statement = connection.createStatement();
            System.out.println("SQL Connection Succeed");
        } catch (Exception e){
            System.out.println("SQL Connection Failed");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
