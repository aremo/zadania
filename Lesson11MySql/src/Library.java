import java.sql.*;

public class Library {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world?characterEncoding=utf8";
        String username = "root";
        String password = "root8990";
        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        String query = "select Name, Population from city where CountryCode = 'POL'";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()) {
            int id = resultSet.getInt(1); //id
            String name = resultSet.getString("Name");
            String countryCode = resultSet.getString(3); //code
            String district = resultSet.getString(4); //district
            int population = resultSet.getInt(5); //id

            System.out.println(id + " " + name + " " + countryCode + " " + district + " " + population);
        }
        connection.close();
    }
}
