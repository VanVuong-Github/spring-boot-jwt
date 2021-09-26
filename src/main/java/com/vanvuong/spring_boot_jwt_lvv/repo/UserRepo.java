package com.vanvuong.spring_boot_jwt_lvv.repo;

import com.vanvuong.spring_boot_jwt_lvv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
