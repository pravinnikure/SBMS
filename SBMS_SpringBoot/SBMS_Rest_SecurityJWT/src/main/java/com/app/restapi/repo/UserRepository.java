package com.app.restapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
		Optional<User> findByUsername(String String);
}
