package DbConnection;


import java.sql.*;


public class MyJDBC {

    public static void main(String[] args){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/examhall", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from data");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("rollNo"));
            }
        }catch (Exception e){
            e.printStackTrace();


        }
    }
}
