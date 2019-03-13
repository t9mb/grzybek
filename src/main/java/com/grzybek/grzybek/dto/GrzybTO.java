package com.grzybek.grzybek.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.grzybek.grzybek.domain.Attribute;
import com.grzybek.grzybek.domain.Grzyb;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class GrzybTO {
    private Integer id;
    @Size(min = 3,max = 20, message = "Nazwa grzyba w zakresie 3-20 słów")
    private String name;
    @Size(max = 1000, message = "Opis jest za długi")
    private String description;
    private Attribute attribute;
    private MultipartFile multipartFile;
    private String image;

    public GrzybTO(Grzyb grzyb, String image){
        this.id = grzyb.getId();
        this.description = grzyb.getDescription();
        this.attribute = grzyb.getAttribute();
        this.name = grzyb.getName();
        this.image = image;
    }
}