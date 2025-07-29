package pro.sky.List_product.service;

import pro.sky.List_product.model.ProductsNames;

import java.util.Collection;

public interface ProductService {
    ProductsNames add(String productName, int productPrice, int id);

    ProductsNames remove(String productName, int productPrice, int id);

    ProductsNames find(String productName, int productPrice, int id);

    //Collection<ProductsNames> findAll();

}
