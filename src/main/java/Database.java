import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
  private static Connection connection;

  private Database() {
  };

  public static Connection getConnection() throws SQLException {
    if (connection == null) {
      init();
    }
    return connection;
  }

  private static void init() throws SQLException {

    String dbURL = "jdbc:postgresql://training-postgres.ckbqjaef5nqv.us-east-2.rds.amazonaws.com/qianggao-p1";
    String username = "postgres";
    String password = "P4ssw0rd!";
    // load postgresql driver

    connection = DriverManager.getConnection(dbURL, username, password);
  }

}
