import java.sql.*;
public class Test0 {
  public static void main(String[] args) {

    String connectionURL = "jdbc:mysql://localhost:3306/mart";

    Class.forName("com.mysql.jdbc.Driver");

    Connection conn = DriverManager.getConnection(connectionURL);

    System.out.println("Connected to Server !!!");
    conn.close();
  }
}