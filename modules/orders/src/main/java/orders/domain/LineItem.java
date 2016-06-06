package orders.domain;

public class LineItem {
    private Product product;
    private int quantity;
    private boolean giftWrap;

    public LineItem(Product product, int quantity, boolean giftWrap) {
        this.product = product;
        this.quantity = quantity;
        this.giftWrap = giftWrap;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }
}
