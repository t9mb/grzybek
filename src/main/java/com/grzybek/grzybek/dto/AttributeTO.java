package com.grzybek.grzybek.dto;


import com.grzybek.grzybek.domain.Attribute;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor

public class AttributeTO {
    private Integer id;
    @NotNull
    @Size(max = 40 , min = 2 ,message = "Opis grzyba(min. 2 znaki)")
    private String description;


    public  AttributeTO(Attribute attribute){
        this.id = attribute.getId();
        this.description = attribute.getDescription();
    }
}
