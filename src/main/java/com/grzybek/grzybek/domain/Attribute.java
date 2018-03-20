package com.grzybek.grzybek.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attribute {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
}
