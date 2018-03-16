package com.grzybek.grzybek.util;


import com.grzybek.grzybek.domain.User;
import com.grzybek.grzybek.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CLR implements CommandLineRunner{

    private final UserRepository userRepository;
    @Override
    public void run(String... strings) throws Exception {
        userRepository.save(User.builder().name("Jan").lastname("Kowalski").build());
        userRepository.save(User.builder().name("Roman").lastname("Polański").build());

    }
}
