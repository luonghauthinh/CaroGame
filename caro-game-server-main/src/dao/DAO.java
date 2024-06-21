package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DAO {
    protected Connection con;

    public DAO() {
        final String DATABASE_NAME = "CaroGame"; // TODO: Confirm your database name
        final String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=" + DATABASE_NAME + ";encrypt=true;trustServerCertificate=true;";
        final String JDBC_USER = "sa";  // TODO: Confirm your database user
        final String JDBC_PASSWORD = "123"; // TODO: Confirm your database password
        
        try {
            // Loading the JDBC driver for SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establishing the connection
            con = DriverManager.getConnection(jdbcURL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection to database failed");
        }
    }
}
