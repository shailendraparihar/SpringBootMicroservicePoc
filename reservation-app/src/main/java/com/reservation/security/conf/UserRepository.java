package com.reservation.security.conf;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String username);

}
