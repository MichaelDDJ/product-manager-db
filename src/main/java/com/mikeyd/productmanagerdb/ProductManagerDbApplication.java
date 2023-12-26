package com.mikeyd.productmanagerdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductManagerDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductManagerDbApplication.class, args);

        ProductController controller = new ProductController();

        //Example actions for controller for reference
//        controller.addProduct(new Product("pot" , "dish" , "kitchen" , 2020));
//
//        controller.getProductByName("pot");
//
//        controller.getAllProducts();
//
//        controller.updateProduct(Product p, String key, String value);
//
//        controller.deleteProduct(Product product);



    }

}
