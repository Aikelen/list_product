package pro.sky.List_product.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductsNames {
    private final String productName;
    private final int productPrice;
    private final int id;

    public ProductsNames(String productName, int productPrice, int id) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.id = id;
    }

    HashMap<Integer, String> idProduct = new HashMap<>();

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getName() {
        return productName + " " + productPrice;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Products :" + productName + " " +
                productPrice;
    }
}
