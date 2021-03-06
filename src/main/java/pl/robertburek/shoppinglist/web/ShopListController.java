package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.robertburek.shoppinglist.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.robertburek.shoppinglist.ShoppingListApplication.categories;
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
        products = products.stream().filter(product -> product.getName() != null).collect(Collectors.toList());
        List<Product> listSelectedProducts = products.stream().filter(new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.isSelected();
            }
        }).collect(Collectors.toList());
        model.addAttribute("products", listSelectedProducts);
        model.addAttribute("categories", categories);
        log.info("Wybrani : " + listSelectedProducts);
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
        int index=0;
        log.info("Wysłałem : " + product);
        for (Product el :products) {
            if (el.getId()==product.getId()) break;
            else index++;
        }
        products.set(index, product);
    }


}
