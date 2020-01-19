package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.robertburek.shoppinglist.Product;
import pl.robertburek.shoppinglist.Product.Category;
import pl.robertburek.shoppinglist.ShoppingList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.robertburek.shoppinglist.ShoppingListApplication.products;


/**
 * Created by Robert Burek
 */

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignShopListController {

//    to jest adnotacja @Slf4j
//    private static final org.slf4j.Logger log =
//            org.slf4j.LoggerFactory.getLogger(DesignTacoController.class);


    @GetMapping
    public String showProducts(Model model) {
//        Category[] categories = Product.Category.values();
//        for (Category category : categories) {
//            log.info(category.name());
//            model.addAttribute(category.toString().toLowerCase(),
//                    filterByCategory(products, category));
//        }
        products = products.stream().filter(new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getName()!=null;
            }
        }).collect(Collectors.toList());
        model.addAttribute("products", products);
        model.addAttribute("shoppingList", new ShoppingList());
        model.addAttribute("product", new Product());
        log.info(model.toString());
        return "design";
    }


    @PostMapping
    public String showSelectedProducts() {
        log.info("Przekierunkowanie do widoku shoppingList");
        return "redirect:/shoppingList";
    }

    private List<Product> filterByCategory(List<Product> products, Category category) {
        return products
                .stream()
                .filter(x -> x.getCategory().equals(category))
                .collect(Collectors.toList());
    }

}
