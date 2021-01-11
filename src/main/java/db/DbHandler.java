package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbHandler {

    public static Connection connect() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/filesdb", "root", "root");
        } catch (Exception e) {
            throw new Exception("Error connecting to the database:");
        }
    }

}
