package database;

import java.sql.*;

public class InsertInto
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/university", username = "root", password = "";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            String sql = "insert into student"
                    + "(ID, FirstName, LastName, Address)"
                    + "values (5, 'Mhr', 'Hasan', 'Bizra')";
            statement.executeUpdate(sql);

            System.out.println("Inserted data");

            // Showing the results
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
//            while(resultSet.next())
//            {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
//            }

            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
