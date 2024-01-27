package com.programmingtechie.productservice.productservice.controller;

import com.programmingtechie.productservice.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.productservice.dto.ProductResponse;
import com.programmingtechie.productservice.productservice.model.Product;
import com.programmingtechie.productservice.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping//("addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProductIntoDB(@RequestBody ProductRequest productRequest){
        productService.addProductIntoDB(productRequest);
    }

    @GetMapping//("getProduct/id")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProductsFromDB(){
        return productService.getAllProductsFromDB();
    }



}
