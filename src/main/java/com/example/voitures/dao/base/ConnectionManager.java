package com.example.voitures.dao.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static Connection INSTANCE;
    private static final String url = "jdbc:mysql://localhost:3306/mycar";
    private static final String user = "root";
    private static final String password = "root";
    private ConnectionManager() {
    }
    public static Connection getINSTANCE() {
        if (INSTANCE == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                INSTANCE = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.err.println("Error during getConnection");
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                System.err.println("Error during loading driver");
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return INSTANCE;
    }
}
