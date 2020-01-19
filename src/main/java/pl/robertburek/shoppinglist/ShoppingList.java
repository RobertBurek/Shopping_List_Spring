package pl.robertburek.shoppinglist;

import lombok.Data;

import java.util.List;

/**
 * Created by Robert Burek
 */

@Data
public class ShoppingList {

//    private int id;
    private String name;
    private List<String> changes;

}
