package pro.sky.List_product.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.List_product.model.ProductsNames;
import pro.sky.List_product.service.ProductService;
import pro.sky.List_product.service.ProductServiceImpl;

@RestController
@RequestMapping("/store")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/order/add")
    public ProductsNames addProduct(@RequestParam String productName, @RequestParam int productPrice, @RequestParam int id) {
        return productService.add(productName, productPrice, id);
    }

    @GetMapping("/order/get")
    public ProductsNames getProduct(@RequestParam String productName, @RequestParam int productPrice, @RequestParam int id) {
        return productService.find(productName, productPrice, id);
    }
}
