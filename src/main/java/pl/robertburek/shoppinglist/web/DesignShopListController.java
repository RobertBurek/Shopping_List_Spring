package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.robertburek.shoppinglist.Product;
import pl.robertburek.shoppinglist.Product.Category;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


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
    public String showDesignForm(Model model) {
        List<Product> products = Arrays.asList(
                new Product(1, "Mleko b/l",0, false,Category.NABIAL),
                new Product(2, "Coca cola",0,false,Category.NAPOJE),
                new Product(3, "Bułka zwykła",0,false,Category.PIECZYWO),
                new Product(4, "Masło",0,false,Category.NABIAL),
                new Product(5, "Śmietana 12%",0,false,Category.NABIAL),
                new Product(6, "Chleb słonacznikowy",0,false,Category.PIECZYWO),
                new Product(7, "Piwo",0,false,Category.NAPOJE),
                new Product(8, "Kiwi",0,false,Category.OWOCE),
                new Product(9, "Pomarańcza",0,false,Category.OWOCE),
                new Product(10,"Marchew",0,false,Category.WARZYWA)
        );
        Category[] categories = Product.Category.values();
        for (Category category : categories) {
            log.info(category.name());
            model.addAttribute(category.toString().toLowerCase(),
                    filterByCategory(products, category));
        }
        model.addAttribute("design", new ShoppingList());
        return "design";
    }

    private List<Product> filterByCategory(List<Product> products, Category category) {
        return products
                .stream()
                .filter(x -> x.getCategory().equals(category))
                .collect(Collectors.toList());
    }

}
