package com.vanvuong.spring_boot_jwt_lvv.service;

import com.vanvuong.spring_boot_jwt_lvv.authen.UserPrincipal;
import com.vanvuong.spring_boot_jwt_lvv.entity.User;

public interface UserService {
    public User createUser(User user);
    UserPrincipal findByUsername(String username);
}
