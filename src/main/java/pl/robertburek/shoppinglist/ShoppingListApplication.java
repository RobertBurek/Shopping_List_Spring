package pl.robertburek.shoppinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShoppingListApplication {

	public static List<Product> products = new ArrayList<>();

	public static void main(String[] args) {

		SpringApplication.run(ShoppingListApplication.class, args);
	}

}
