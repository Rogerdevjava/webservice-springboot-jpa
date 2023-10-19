package com.magic.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
