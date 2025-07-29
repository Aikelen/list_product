package pro.sky.List_product.service;


import org.springframework.stereotype.Service;
import pro.sky.List_product.model.ProductsNames;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {
        private final Map<String, ProductsNames> products;


    public ProductServiceImpl(Map<String, ProductsNames> products) {
        this.products = new HashMap<>();
    }

    @Override
    public ProductsNames add(String productName, int productPrice, int id) {
        ProductsNames productsNames = new ProductsNames(productName, productPrice, id);
        products.put(productsNames.getName(), productsNames);
        return productsNames;
    }

    @Override
    public ProductsNames remove(String productName, int productPrice, int id) {
        ProductsNames productsNames = new ProductsNames(productName, productPrice, id);
        return productsNames;
    }

    @Override
    public ProductsNames find(String productName, int productPrice, int id) {
        ProductsNames productsNames = new ProductsNames(productName, productPrice, id);
        return productsNames;
    }
}
