package com.company;

import java.sql.*;

public class ToDoList {
    String dbURL = "jdbc:mysql://localhost:3306/todolist?serverTimezone=UTC";
    String username = "root";
    String password = "root";

    public void connectionMade(){ // Used to test the connection of the database to ensure it works
        try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Connection successful.");
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public void returnRows() throws SQLException {
        try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            String sql = "SELECT * FROM newlist;";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("ID  -  Task      -      Date      -      Priority?");
            while(rs.next()){
                System.out.println(rs.getInt("id") + "    -   " + rs.getString("job") + "   -   " + rs.getDate("date") + "   -   " + rs.getBoolean("priority"));
            }

        }
    }

    public void addRows(String newTask, String newDate, int newPriority) throws SQLException {
        try(Connection conn = DriverManager.getConnection(dbURL, username, password)){
            String sql = "INSERT INTO newlist(job, date, priority) VALUES ('" + newTask + "', '" + newDate + "', '" + newPriority + "')";
            Statement statement = conn.createStatement();
            boolean rs = statement.execute(sql);
        }
    }

    public void deleteRows(int idNumber) throws SQLException {
        try(Connection conn = DriverManager.getConnection(dbURL, username, password)){
            String sql = "DELETE FROM newlist WHERE id = " + idNumber + ";";
            Statement statement = conn.createStatement();
            boolean rs = statement.execute(sql);
        }
    }
}


