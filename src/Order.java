public class Order extends BaseObject {
    private Product product;
    private Shopper shopper;

    public Order(int id, Product product, Shopper shopper) {
        super(id);
        this.product = product;
        this.shopper = shopper;
    }

    public void printOrderInfo() {
        System.out.println("order num-" + id + ": " + shopper.getName() + " bought " + product.getName());
    }
}