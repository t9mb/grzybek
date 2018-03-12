package com.grzybek.grzybek.repository;

import com.grzybek.grzybek.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);                   //select * from users where name like name;
}
