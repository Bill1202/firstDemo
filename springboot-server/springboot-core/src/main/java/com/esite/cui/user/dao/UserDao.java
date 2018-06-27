package com.esite.cui.user.dao;

import com.esite.cui.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {
}
