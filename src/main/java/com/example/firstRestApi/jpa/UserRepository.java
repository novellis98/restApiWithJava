package com.example.firstRestApi.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstRestApi.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
