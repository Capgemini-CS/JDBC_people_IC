package com.person.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionManager implements ConnectionManager {
    Connection connection;
     String url = "jdbc:mysql://localhost:3306/people";
     String userName = "root";
     String password = "Ochelari123#";

    @Override
    public Connection getConnection() throws SQLException {
        return connection = DriverManager.getConnection(url, userName, password);
    }
}
