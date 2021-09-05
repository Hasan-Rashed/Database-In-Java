package database;

import java.sql.*;

public class UpdateDatabase
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/university", username = "root", password = "";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String sql = "update student " +
                    "set FirstName = 'Hasan', LastName = 'Rashed', Address = 'Chittagong'" +
                    "where ID = 1";

            statement.executeUpdate(sql);
            System.out.println("Data updated");

            // Showing results
            ResultSet resultSet = statement.executeQuery("Select * from student");
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt(1) + "    " + resultSet.getString(2) + "    " + resultSet.getString(3) + " " + resultSet.getString(4));
            }

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
