package com.grzybek.grzybek.services;

import com.grzybek.grzybek.domain.TypeUser;
import com.grzybek.grzybek.domain.User;
import com.grzybek.grzybek.dto.UserTO;
import com.grzybek.grzybek.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public List<User> getListAllUser() {
        return userRepository.findAll();
    }

    public void deleteUser(Integer id) { userRepository.delete(id); }

    public void createUser(UserTO userTO){
        User user = convertToUser(userTO);
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        user.setTypeUser(TypeUser.USER);
        user.setIsActive(true);
        userRepository.save(user);
    }

    public UserTO getUserById(Integer id) {
        User user = userRepository.findOne(id);
        return new UserTO(user);
    }


    public void updateUser(User user) { userRepository.saveAndFlush(user); }

    private User convertToUser(UserTO userTO){
        return User.builder().id(userTO.getId())
                .adress(userTO.getAdress())
                .lastname(userTO.getLastname())
                .name(userTO.getName())
                .phone(userTO.getPhone())
                .postnumber(userTO.getPostnumber())
                .password(userTO.getPassword())
                .build();
    }

}
