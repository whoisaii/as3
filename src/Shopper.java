public class Shopper extends BaseObject {
    private String name;

    public Shopper(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Покупатель: " + name;
    }
}