package com.example.controller;

import com.example.enity.Product;
import com.example.enity.Sale;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/seeding/product")
public class SeedController {
    @Autowired
    ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET)
    public String seed(){
        Product productSamsung = new Product("Dien Thoai Samsung","Sản phẩm tốt nhất",Calendar.getInstance().getTimeInMillis(),1000000.00);
        Sale sale1 = new Sale(1,"Nguyen Hai Dang",Calendar.getInstance().getTimeInMillis(),productSamsung);
        productSamsung.setSale(sale1);

        Product productIphone = new Product("Dien Thoai Iphone","Sản phẩm tốt nhì",Calendar.getInstance().getTimeInMillis(),2000000.00);
        Sale sale2 = new Sale(2,"Nguyen Thanh Duong",Calendar.getInstance().getTimeInMillis(),productIphone);
        productIphone.setSale(sale2);

        Product productOppo = new Product("Dien Thoai Oppo","Sản phẩm tốt ba",Calendar.getInstance().getTimeInMillis(),3000000.00);
        Sale sale3 = new Sale(3,"Nguyen Thanh Dat",Calendar.getInstance().getTimeInMillis(),productOppo);
        productOppo.setSale(sale3);


        Product productIpad = new Product("Ipad","Sản phẩm tốt bốn",Calendar.getInstance().getTimeInMillis(),4000000.00);
        Sale sale4 = new Sale(4,"Doan Van Hau",Calendar.getInstance().getTimeInMillis(),productIpad);
        productIpad.setSale(sale4);

        List<Product> products= Arrays.asList(productSamsung,productIphone,productOppo,productIpad);
        productRepository.saveAll(products);
        return   "ok";
    }
}
