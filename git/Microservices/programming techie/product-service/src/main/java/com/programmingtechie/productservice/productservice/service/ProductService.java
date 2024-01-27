package com.programmingtechie.productservice.productservice.service;

import com.programmingtechie.productservice.productservice.dto.ProductRequest;
import com.programmingtechie.productservice.productservice.dto.ProductResponse;
import com.programmingtechie.productservice.productservice.model.Product;
import com.programmingtechie.productservice.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    public void addProductIntoDB(ProductRequest productRequest){
        //map the productRequest to product model
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProductsFromDB() {
        //Product -> ProductResponse
        List<Product> productList = productRepository.findAll();

        return productList.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
