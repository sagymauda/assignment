package db;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordToDb {


    public void insert(String actionName , String fileName , String manipulatedFile, Date date) throws Exception {

        String sql = "INSERT INTO actions VALUES( operation , file_name , manipulated_file , creation_date  ) VALUES (?,?,?,?,)";
        try {
            PreparedStatement preparedStatement = DbHandler.connect().prepareStatement(sql);
            preparedStatement.setString(1,actionName);
            preparedStatement.setString(2,fileName);
            preparedStatement.setString(3,manipulatedFile);
            preparedStatement.setDate(4,date);

            preparedStatement.executeUpdate();

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
