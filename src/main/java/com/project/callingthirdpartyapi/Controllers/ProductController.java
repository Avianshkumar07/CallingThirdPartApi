package com.project.callingthirdpartyapi.Controllers;


import com.project.callingthirdpartyapi.Models.Product;
import com.project.callingthirdpartyapi.Services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/products")
public class ProductController {


    private ProductService ps;

    public ProductController(ProductService productService) {

        this.ps = productService;
    }


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable ("id") long id){
        return ps.getProductById(id);
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product){
        return new Product();
    }

    @PutMapping("/")
    public Product updateProduct(@RequestBody Product product){
        return new Product();
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
        return;
    }
}
