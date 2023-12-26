package com.mikeyd.productmanagerdb;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    List<Product> products = new ArrayList<>();
    public  void addProduct(p) {
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return prods;
    }

    public Product getProductByText() {
        return prod;
    }

    public Product updateProduct (String key, String value) {
        return prod;
    }

    public void deleteProduct() {
        products.remove();
    }

}
