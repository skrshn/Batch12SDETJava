package com.syntax.DatabaseConnectorMySql;

import java.sql.*;

public class ConnectorTest01 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javabase";
        String username = "root";
        String password = "Password123!";
        final String query = "SELECT id, first, last, age FROM TEST";

        System.out.println("Connecting database...");

//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            System.out.println("Database connected!");
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the database!", e);
//        }


//        System.out.println("Loading driver...");
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded!");
//        } catch (ClassNotFoundException e) {
//            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
//        }


//        try (Connection conn = DriverManager.getConnection(url, username, password);
//             Statement stmt = conn.createStatement();
//        ) {
//            String sql = "CREATE TABLE TEST " +
//                    "(id INTEGER not NULL, " +
//                    " first VARCHAR(255), " +
//                    " last VARCHAR(255), " +
//                    " age INTEGER, " +
//                    " PRIMARY KEY ( id ))";
//
//            stmt.executeUpdate(sql);
//            System.out.println("Created table in given database...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try (
//                Connection conn = DriverManager.getConnection(url, username, password);
//                Statement stmt = conn.createStatement();
//        ) {
//            // Execute a query
//            System.out.println("Inserting records into the table...");
//            String sql = "INSERT INTO Test VALUES (100, 'Zara', 'Ali', 18)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Test VALUES (101, 'Mahnaz', 'Fatma', 25)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Test VALUES (102, 'Zaid', 'Khan', 30)";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO Test VALUES(103, 'Sumit', 'Mittal', 28)";
//            stmt.executeUpdate(sql);
//            System.out.println("Inserted records into the table...");
//        } catch (
//                SQLException e) {
//            e.printStackTrace();
//        }

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
        ) {
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------");


        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "UPDATE Test " +
                    "SET age=106 "+
                    " WHERE Last = 'Sahin'";
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
