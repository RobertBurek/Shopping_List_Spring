package pl.robertburek.shoppinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShoppingListApplication {


    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Mleko b/l", 0, false, Product.Category.NABIAŁ));
        products.add(new Product(2, "Coca cola", 2, true, Product.Category.NAPOJE));
        products.add(new Product(3, "Bułka zwykła", 0, false, Product.Category.PIECZYWO));
        products.add(new Product(4, "Masło", 4, false, Product.Category.NABIAŁ));
        products.add(new Product(5, "Śmietana 12%", 3, true, Product.Category.NABIAŁ));
        products.add(new Product(6, "Chleb słonacznikowy", 0, false, Product.Category.PIECZYWO));
        products.add(new Product(7, "Piwo", 0, false, Product.Category.NAPOJE));
        products.add(new Product(8, "Kiwi", 0, false, Product.Category.OWOCE));
        products.add(new Product(9, "Pomarańcza", 0, false, Product.Category.OWOCE));
        products.add(new Product(10, "Marchew", 0, false, Product.Category.WARZYWA));
        products.add(new Product(11, "Orzeszki ziemne", 0, false, Product.Category.PRZEKĄSKI));
        products.add(new Product(12, "Chipsy paprykowe", 0, false, Product.Category.PRZEKĄSKI));
        products.add(new Product(13, "Popcorn maślany", 0, false, Product.Category.PRZEKĄSKI));
    }



	public static void main(String[] args) {

		SpringApplication.run(ShoppingListApplication.class, args);
	}

}
