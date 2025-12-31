import java.util.Objects;
public class Product extends BaseObject {
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        super(id);
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return "product id=" + id + ", name=" + name + ", price=" + price + " ";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}