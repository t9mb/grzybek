package com.grzybek.grzybek.dto;

import com.grzybek.grzybek.domain.Ecology;
import com.grzybek.grzybek.domain.Grzyb;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
public class LocalizationTO {
    private Integer id;
    @Size(max = 1000, message = "Przekroczenie maksymalnej długości komentarza(max 1000)")
    public String comment;
    private double localizationNorth;
    private double localizationEast;
    private Boolean isPrivate;
    private Ecology ecology;
    private Integer adminMark;
    private Grzyb grzyb;
}
