package pl.robertburek.shoppinglist;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * Created by Robert Burek
 */

@Data
@RequiredArgsConstructor
public class Product implements Serializable {

    private final int id;
    private final String name;
    private final int quantity;
    private final boolean selected ;
    private final Category category;

    public enum Category {
        NAPOJE, WARZYWA, OWOCE, NABIAL, PIECZYWO, PRZEKASKI
    }
}
