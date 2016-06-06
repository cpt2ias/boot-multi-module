package products.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {
    private String id;
    private String name;
    private String description;
    private List<Category> categories = new ArrayList<>();
    private double price;
    private double weight;
    private double height;
    private double width;
    private double length;

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Category> getCategories() {
        return Collections.unmodifiableList(categories);
    }

    public void categorise(Category category) {
        categories.add(category);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
