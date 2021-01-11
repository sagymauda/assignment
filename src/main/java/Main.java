import actions.*;
import db.DefiningTables;
import db.InsertRecordToDb;
import filehandler.FileManipulation;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {


    public static void main(String[] args) throws Exception {


        //
        DefiningTables definingTables = new DefiningTables();
        definingTables.defineTable();


        FileManipulation fileManipulation = new FileManipulation();
        fileManipulation.manipulate(args[0], args[1], ActionName.valueOf(args[2]));
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        InsertRecordToDb insertRecordToDb = new InsertRecordToDb();
        insertRecordToDb.insert(ActionName.valueOf(args[2]) ,args[0],args[1],date);


    }

}
