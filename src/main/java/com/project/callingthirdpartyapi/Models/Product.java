package com.project.callingthirdpartyapi.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class Product {

    private Long id;
    private String title;
    private double price;
    private String descp;
    private String image;
    private Category category;

}
