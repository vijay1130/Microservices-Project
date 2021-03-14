package com.vijay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vijay.entity.PhoneBookEntity;

@Repository
public interface PhoneRegistory extends JpaRepository<PhoneBookEntity, Integer> {

	PhoneBookEntity findByphoneId(Integer phoneId);

	

}
