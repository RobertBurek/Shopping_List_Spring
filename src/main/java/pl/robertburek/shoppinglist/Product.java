package pl.robertburek.shoppinglist;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * Created by Robert Burek
 */

@Data
//@RequiredArgsConstructor
public class Product {

    private int id;
    private String name;
    private int quantity;
    private boolean selected ;
    private Category category;

    public Product(int id, String name, int quantity, boolean selected, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.selected = selected;
        this.category = category;
    }

    public Product() {
    }

    public enum Category {
        NAPOJE, WARZYWA, OWOCE, NABIAŁ, PIECZYWO, PRZEKASKI
    }
}
