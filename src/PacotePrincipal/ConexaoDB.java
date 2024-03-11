package PacotePrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/PC1";
    private static final String USER = "cliente";
    private static final String PASSWORD = "coxinha123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
