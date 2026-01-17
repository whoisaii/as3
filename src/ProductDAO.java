import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void add(Product product) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO products VALUES (" + product.id + ", '"
                    + product.getName() + "', " + product.getPrice() + ")";
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ошибка базы: " + e.getMessage()); // Теперь ты увидишь, что именно не нравится базе
        }
    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                ));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("не получилось прочитать продукты");
        }
        return products;
    }

    public void updatePrice(int id, double price) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "UPDATE products SET price=" + price + " WHERE id=" + id;
            stmt.executeUpdate(sql);
            conn.close();
        } catch (Exception e) {
            System.out.println("не получилось обновить цену");
        }
    }

    public void delete(int id) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM products WHERE id=" + id;
            stmt.executeUpdate(sql);
            conn.close();
        } catch (Exception e) {
            System.out.println("не получилось удалить продукт");
        }
    }
}
