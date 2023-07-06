import java.sql.DriverManager;
public class Test0 {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdgc.Driver");
      String connectionURL = "jdbc:mysql://localhost/booksdb";

      Connection conn = DriverManager.getConnection (connectionURL,"root","<passwordhere");
      String insertQuery = "insert into books values(101,'jdk by Wrox'.'ivor horton',750)";
      
      Statement stmt = conn.createStatement();
      stmt.execute(insertQuery);
      stmt.close();

      conn.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}