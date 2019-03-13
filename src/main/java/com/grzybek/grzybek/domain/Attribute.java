package com.grzybek.grzybek.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attribute {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;
}
