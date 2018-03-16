package com.grzybek.grzybek.services;

import com.grzybek.grzybek.domain.User;
import com.grzybek.grzybek.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getListAllUser() {
        return userRepository.findAll();
    }

    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }

}
