package com.signinsignout.service;

import com.signinsignout.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}