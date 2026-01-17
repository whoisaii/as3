import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ecommerce",
                    "postgres",
                    "1234"
            );
        } catch (Exception e) {
            System.out.println("не получилось подключиться к базе");
            return null;
        }
    }
}
