package com.scaler.EcomProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Entity
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private String image;
    @ManyToOne
    private Category category;
}

// cardinality
//      P : C
//(P)   1 : 1
//(C)   M : 1
//-------------------
//      M : 1
