import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShopperDAO {
    public void add(Shopper shopper) {
        String sql = "INSERT INTO shoppers (id, name) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, shopper.id);
            pstmt.setString(2, shopper.getName());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Запись с ID " + shopper.id + " уже существует в таблице shoppers.");
        }
    }
}
