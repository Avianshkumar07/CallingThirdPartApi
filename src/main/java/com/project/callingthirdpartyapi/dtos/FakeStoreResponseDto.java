package com.project.callingthirdpartyapi.dtos;

import com.project.callingthirdpartyapi.Models.Category;
import lombok.Data;


@Data
public class FakeStoreResponseDto {

    private Long id;
    private String title;
    private double price;
    private String descp;
    private String image;
    private String category;

}
