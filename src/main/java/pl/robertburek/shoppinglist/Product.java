package pl.robertburek.shoppinglist;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by Robert Burek
 */

@Data
@RequiredArgsConstructor
public class Product {

    private final String id;
    private final String name;
    private final String quantity;
    private final Categorie categorie;

    public enum Categorie {
        NAPOJE, WARZYWA, OWOCE, NABIAL, PIECZYWO
    }
}
