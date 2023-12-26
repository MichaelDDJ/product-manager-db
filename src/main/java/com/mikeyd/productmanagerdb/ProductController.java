package com.mikeyd.productmanagerdb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductController {

    ProductDB db = new ProductDB();
    public  void addProduct(Product p) {
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }

    public Product getProductByName(String name) {
        return db.getProductByName(name);
    }

    //need to up products list
    public void updateProduct (Product p, String key, String value) {
        db.updateProduct(p, key, value);
    }

    public void deleteProduct(Product p) {
        db.delete(p);
    }

}
