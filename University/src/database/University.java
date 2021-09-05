package database;
import java.sql.*;

public class University
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/university", username = "root", password = "";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next())
            {
                System.out.println(resultSet.getInt(1) + "    " + resultSet.getString(2) + "    " + resultSet.getString(3) + "    " + resultSet.getString(4));
            }

            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}