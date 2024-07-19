package com.project.callingthirdpartyapi.Services;

import com.project.callingthirdpartyapi.Models.Product;

public interface ProductService {

    Product getProductById(long id);

    Product updateProduct(long id);

    Product createProduct(Product product);

    Product deleteProduct(long id);
}
