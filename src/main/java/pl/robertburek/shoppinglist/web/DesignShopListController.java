package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.robertburek.shoppinglist.Product;
import pl.robertburek.shoppinglist.Product.Category;
import pl.robertburek.shoppinglist.ShoppingList;

import javax.validation.Valid;
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
        model.addAttribute("products", products);
//        ShoppingList shoppingList  = new ShoppingList();
//        shoppingList.setProducts(products);
        model.addAttribute("shoppingList", new ShoppingList());
        model.addAttribute("product", new Product());
        log.info(model.toString());
        return "design";
    }


    @PostMapping
    public String showSelectedProducts() {
//        log.info("Przetwarzanie projektu : " + shoppingList);
//        log.info("!!!!TAAAK : " + product);
//        List<Product> listSelectedProducts = products.stream().filter(new Predicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.isSelected();
//            }
//        }).collect(Collectors.toList());
//        model.addAttribute("products", listSelectedProducts);
//        log.info("Wybrani : ",listSelectedProducts);
        return "redirect:/shoppingList";
    }

//    @PostMapping
//    public void save() {
////        log.info("Przetwarzanie projektu : " + shoppingList);
//        log.info("!!!!Przetwarzanie projektu : " + products);
////        products = products.stream().filter(new Predicate<Product>() {
////            @Override
////            public boolean test(Product product) {
////                return product.isSelected();
////            }
////        }).collect(Collectors.toList());
//        List<Product> newProducts = products.stream().filter(new Predicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.isSelected();
//            }
//        }).collect(Collectors.toList());
////        model.addAttribute("products", newProducts);
//        log.info(newProducts.toString());
////        return "redirect:/shoppingList";
//    }

    private List<Product> filterByCategory(List<Product> products, Category category) {
        return products
                .stream()
                .filter(x -> x.getCategory().equals(category))
                .collect(Collectors.toList());
    }

}
