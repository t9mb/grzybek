package com.grzybek.grzybek.domain;


import lombok.*;
import javax.persistence.*;


@Entity
@Getter
@Setter
@Builder

@AllArgsConstructor
@NoArgsConstructor

public class User {


    @Id
    @GeneratedValue
    private Integer id;

    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;
    private String adress;
    private String postnumber;
    private Boolean isActive;


}
