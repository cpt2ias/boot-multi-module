package orders.domain;


import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private String customerId;
    private String shippingAddress;
    private String billingAddress;
    private List<LineItem> lineItems = new ArrayList<>();

    public Order(String id, String customerId, String shippingAddress, String billingAddress) {
        this.id = id;
        this.customerId = customerId;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public void add(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
