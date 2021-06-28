package com.example.controller;

import com.example.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;


}
