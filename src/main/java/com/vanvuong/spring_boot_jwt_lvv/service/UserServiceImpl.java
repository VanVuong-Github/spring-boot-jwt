package com.vanvuong.spring_boot_jwt_lvv.service;

import com.vanvuong.spring_boot_jwt_lvv.authen.UserPrincipal;
import com.vanvuong.spring_boot_jwt_lvv.entity.User;
import com.vanvuong.spring_boot_jwt_lvv.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    @Transactional
    public User createUser(User user) {
        return userRepo.saveAndFlush(user);
    }

    @Override
    @Transactional
    public UserPrincipal findByUsername(String username) {
        return null;
    }
}
