package com.marciosilva.SpringbootJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marciosilva.SpringbootJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
