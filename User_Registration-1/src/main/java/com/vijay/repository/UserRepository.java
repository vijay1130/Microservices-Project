package com.vijay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	

	User findByuserId(Integer userId);

}
