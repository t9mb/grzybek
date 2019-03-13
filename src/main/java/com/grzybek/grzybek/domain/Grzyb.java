package com.grzybek.grzybek.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Grzyb {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Column(length = 10000)
    private String description;
    @ManyToOne
    private Attribute attribute;
    @Column(length = 20000000)
    private byte[] image;
}
