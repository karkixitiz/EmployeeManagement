package com.signinsignout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signinsignout.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
 
 User findByEmail(String email);
}