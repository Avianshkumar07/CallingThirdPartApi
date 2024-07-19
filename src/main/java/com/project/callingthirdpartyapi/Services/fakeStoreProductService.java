package com.project.callingthirdpartyapi.Services;

import com.project.callingthirdpartyapi.Models.Category;
import com.project.callingthirdpartyapi.Models.Product;
import com.project.callingthirdpartyapi.dtos.FakeStoreResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service

public class fakeStoreProductService  implements ProductService{

    private RestTemplate restTemplate;

    @Autowired
    fakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @Override
    public Product getProductById(long id) {
        FakeStoreResponseDto fdto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id , FakeStoreResponseDto.class);

        if(fdto == null){
            return null;
        }
        //if response is there convert the response into product...
        return ConvertFakeStoreDtoToProduct(fdto);
    }

    public Product ConvertFakeStoreDtoToProduct(FakeStoreResponseDto fdto){
        Product p = new Product();
        p.setId(fdto.getId());
        p.setDescp(fdto.getDescp());
        p.setTitle(fdto.getTitle());
        p.setPrice(fdto.getPrice());
        p.setImage(fdto.getImage());

        Category c = new Category();
        c.setTitle(fdto.getCategory());
        p.setCategory(c);
        return p;
    }

    @Override
    public Product updateProduct(long id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(long id) {
        return null;
    }
}
