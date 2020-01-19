package pl.robertburek.shoppinglist.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.robertburek.shoppinglist.Product;
import pl.robertburek.shoppinglist.Product.Category;
import pl.robertburek.shoppinglist.ShoppingList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.ArrayList;
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


//    @GetMapping
//    public String showListForm(Model model) {
////        Category[] categories = Product.Category.values();
////        for (Category category : categories) {
////            log.info(category.name());
////            model.addAttribute(category.toString().toLowerCase(),
////                    filterByCategory(products, category));
////        }
//        model.addAttribute("products", products.stream().filter(new Predicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.isSelected();
//            }
//        }).collect(Collectors.toList()));
////        model.addAttribute("design", new ShoppingList());
////        model.addAttribute("product", new Product());
//        log.info(model.toString());
//        return "shoppingList";
//    }


//    @PostMapping
//    public String showList(Model model) {
////        log.info("Przetwarzanie projektu : " + shoppingList);
//        log.info("Przetwarzanie projektu : " + products);
//        products = products.stream().filter(new Predicate<Product>() {
//            @Override
//            public boolean test(Product product) {
//                return product.isSelected();
//            }
//        }).collect(Collectors.toList());
//        log.info("Po sortowaniu : " + products);
//        model.addAttribute("products", products);
//        return "shoppingList";
////        return "redirect:/design";
//    }


    @PostMapping
    public void save(@RequestBody Product product){
//    public void save(@RequestBody String jsonString){
//            (HttpServletRequest request,
//             @RequestBody Product product, BindingResult result, HttpServletResponse response) {
//                response.setHeader("Location", ServletUriComponentsBuilder.fromCurrentContextPath()
//                        .path("/shoppingList/" + product.getId()).toUriString());

//        log.info("Request : " + request);
//        log.info("Response : " + response);
//        log.info("Resualt : " + result);
        log.info("!!!Product : " + product);
    }


}
