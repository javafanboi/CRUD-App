package com.userportal.portalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userportal.portalbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
