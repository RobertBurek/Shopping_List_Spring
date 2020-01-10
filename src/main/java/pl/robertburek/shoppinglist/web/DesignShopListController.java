package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.robertburek.shoppinglist.InfoProduct;
import pl.robertburek.shoppinglist.Product;
import pl.robertburek.shoppinglist.Product.Category;
import pl.robertburek.shoppinglist.ShoppingList;

import java.util.ArrayList;
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

    static List<Product> products =new ArrayList<>();
    static {
        products.add(new Product(1, "Mleko b/l",0, false,Category.NABIAL));
        products.add( new Product(2, "Coca cola",2,true,Category.NAPOJE));
        products.add( new Product(3, "Bułka zwykła",0,false,Category.PIECZYWO));
        products.add( new Product(4, "Masło",4,false,Category.NABIAL));
        products.add( new Product(5, "Śmietana 12%",3,true,Category.NABIAL));
        products.add( new Product(6, "Chleb słonacznikowy",0,false,Category.PIECZYWO));
        products.add( new Product(7, "Piwo",0,false,Category.NAPOJE));
        products.add( new Product(8, "Kiwi",0,false,Category.OWOCE));
        products.add( new Product(9, "Pomarańcza",0,false,Category.OWOCE));
        products.add( new Product(10,"Marchew",0,false,Category.WARZYWA));
    }

    @GetMapping
    public String showDesignForm(Model model) {
//        Category[] categories = Product.Category.values();
//        for (Category category : categories) {
//            log.info(category.name());
//            model.addAttribute(category.toString().toLowerCase(),
//                    filterByCategory(products, category));
//        }
        model.addAttribute("products", products);
        model.addAttribute("design", new ShoppingList());
        model.addAttribute("product", new Product());
        log.info(model.toString());
        return "design";
    }

    @PostMapping
    public String selectProduct(@ModelAttribute Product product) {
        log.info("Przetwarzanie projektu : " + product);
        if(products.get(product.getId()-1).isSelected()) products.get(product.getId()-1).setSelected(false);
        else products.get(product.getId()-1).setSelected(true);
        return "redirect:/design";
    }

    private List<Product> filterByCategory(List<Product> products, Category category) {
        return products
                .stream()
                .filter(x -> x.getCategory().equals(category))
                .collect(Collectors.toList());
    }

}
