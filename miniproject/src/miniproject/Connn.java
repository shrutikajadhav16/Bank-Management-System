package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connn {
    Connection connection;
    Statement statement;
    public  Connn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
            statement= connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
