package orders.domain;

public class Product {
    private String id;
    private String name;
    private String description;

    public Product(String id, String name) {
        this(id, name, null);
    }

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void addToOrder(Order order, int quantity) {
        addToOrder(order, quantity, false);
    }

    public void addToOrder(Order order, int quantity, boolean giftWrap) {
        order.add(new LineItem(this, quantity, false));
    }
}
