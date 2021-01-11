package db;

import java.sql.SQLException;
import java.sql.Statement;

import static db.DbHandler.connect;

public class DefiningTables {

    public void defineTable() throws Exception {
        String sql = "CREATE TABLE actions(id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY" +
                " (START WITH 1, INCREMENT BY 1), operation ENUM (sort  , shuffle , revers),file_name VARCHAR(30),manipulated_file VARCHAR(30),creation_date DATE)";

        Statement statement = null;

        {
            try {
                statement = connect().createStatement();
                statement.execute(sql);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) {
                        connect().close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


