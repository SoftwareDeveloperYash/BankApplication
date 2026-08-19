import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {

    // Reads DB credentials from environment variables instead of hardcoding them.
    // Set these on your machine before running:
    //   DB_URL      e.g. jdbc:mysql://localhost:3306/bank
    //   DB_USER     e.g. root
    //   DB_PASSWORD your MySQL password
    private static final String DB_URL = System.getenv().getOrDefault(
            "DB_URL", "jdbc:mysql://localhost:3306/bank");
    private static final String DB_USER = System.getenv().getOrDefault(
            "DB_USER", "root");
    private static final String DB_PASSWORD = System.getenv().getOrDefault(
            "DB_PASSWORD", "");

    public static Connection getconnection() {
        Connection conn;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
