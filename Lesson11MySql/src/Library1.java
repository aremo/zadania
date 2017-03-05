import java.sql.*;
import java.util.Scanner;

public class Library1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world?characterEncoding=utf8";
        String username = "root";
        String password = "root8990";
        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta:");
        String newName = sc.nextLine();

        System.out.println("Podaj nową liczbę ludności:");
        int newPopulation = sc.nextInt();

        String update = "update city set population = ? where name = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setInt(1, newPopulation);
        preparedStatement.setString(2, newName);

        int updated = preparedStatement.executeUpdate();

        System.out.println("Zaktualizowane rekordy: " + updated);

        String query2 = "SELECT * FROM city WHERE Name=?";
        PreparedStatement preparedStatement1 = connection.prepareStatement(query2);
        preparedStatement1.setString(1, newName);
        ResultSet resultSet = preparedStatement1.executeQuery();
        resultSet.next();
        int id1 = resultSet.getInt("ID");
        String name1 = resultSet.getString("Name");
        int population1 = resultSet.getInt("Population");
        System.out.println("id: " + id1 + ", nazwa: " + name1 + ", ludność: " + population1);
    }
}

