package com.grzybek.grzybek.dto;

import com.grzybek.grzybek.domain.TypeUser;
import com.grzybek.grzybek.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class UserTO {
    private Integer id;
    private String email;
    @NotNull
    @Size(max = 20, min = 5, message = "Hasło musi posiadać minimum 5 znaków")
    private String password;
    @NotNull
    @Size(max = 20, min = 3, message = "Imie musi posiadać minimum 3 znaki")
    private String name;
    @NotNull
    @Size(max = 20, min = 3, message = "Nazwisko musi posiadać minium 3 znaki")
    private String lastname;
    @Pattern(regexp = "^([0+]48)?\\d{9}$", message = "Niewłaściwy format telefonu")
    private String phone;
    private String adress;
    @Pattern(regexp = "^[0-9]{2}-[0-9]{3}", message = "Nieprawidłowy format kodu pocztowego. Format 00-000")
    private String postnumber;
    private TypeUser typeUser;
    private Boolean isActive;

    public UserTO(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.name = user.getName();
        this.lastname = user.getLastname();
        this.phone = user.getPhone();
        this.adress = user.getAdress();
        this.postnumber = user.getPostnumber();
        this.typeUser = user.getTypeUser();
        this.isActive = user.getIsActive();
    }

}
