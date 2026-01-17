import java.sql.Connection;
import java.sql.Statement;

public class ShopperDAO {

    public void add(Shopper shopper) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO shoppers VALUES (" + shopper.id + ", '"
                    + shopper.getName() + "')";
            stmt.executeUpdate(sql);
            conn.close();
        } catch (Exception e) {
            System.out.println("не получилось добавить покупателя");
        }
    }
}

