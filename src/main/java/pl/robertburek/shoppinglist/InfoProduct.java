package pl.robertburek.shoppinglist;

import lombok.Data;

import java.util.List;

/**
 * Created by Robert Burek
 */
@Data
public class InfoProduct {
    private int idProduct;
    private String nameProduct;
    private List<String> paramsProduct;
}
