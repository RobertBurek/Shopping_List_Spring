package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.robertburek.shoppinglist.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.robertburek.shoppinglist.ShoppingListApplication.products;


/**
 * Created by Robert Burek
 */

@Slf4j
@Controller
@RequestMapping("/shoppingList")
public class ShopListController {

//    to jest adnotacja @Slf4j
//    private static final org.slf4j.Logger log =
//            org.slf4j.LoggerFactory.getLogger(DesignTacoController.class);


    @GetMapping
    public String showSelectedProducts(Model model) {
        List<Product> listSelectedProducts = products.stream().filter(new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.isSelected();
            }
        }).collect(Collectors.toList());
        model.addAttribute("products", listSelectedProducts);
        log.info("Wybrani : ", listSelectedProducts);
        return "shoppingList";
    }


    @PostMapping
    public String showList(Model model) {
        log.info("Przetwarzanie projektu : " + products);
        model.addAttribute("products", products);
        return "redirect:/design";
    }

    @PutMapping
    public void modificationList(@RequestBody Product product) {
        log.info("Wysłałem : " + product);
        products.set(product.getId() - 1, product);
    }


}
