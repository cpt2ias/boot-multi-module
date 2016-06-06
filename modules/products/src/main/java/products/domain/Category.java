package products.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Category {
    private String id;
    private String name;
    private String description;
    private Category parent;
    private List<Category> children = new ArrayList<>();

    public Category(Category parent, String description, String name, String id) {
        this.parent = parent;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public void addChildren(Category... children) {
        for (Category category : children) {
            this.children.add(category);
        }
    }

    public List<Category> children() {
        return Collections.unmodifiableList(children);
    }

    public List<Category> siblings() {
        return (parent == null) ? Collections.<Category>emptyList() :
            parent.children.stream().filter(c -> c != this).collect(Collectors.toList());
    }
}
