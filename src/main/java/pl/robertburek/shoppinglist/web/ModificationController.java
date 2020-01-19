package pl.robertburek.shoppinglist.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.robertburek.shoppinglist.Product;

import static pl.robertburek.shoppinglist.ShoppingListApplication.products;

/**
 * Created by Robert Burek
 */
@Slf4j
@Controller
@RequestMapping("/modificationProduct")
public class ModificationController {

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
        products.set(product.getId(),product);
        log.info("zmianiłem w bazie");
    }
}
