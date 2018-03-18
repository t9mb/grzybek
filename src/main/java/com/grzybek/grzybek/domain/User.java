package com.grzybek.grzybek.domain;


import lombok.*;
import javax.persistence.*;


@Entity
@Data
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
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;
    private Boolean isActive;


}
