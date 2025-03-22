package com.praveen.FiveStarHotelManagement.repo;

import com.praveen.FiveStarHotelManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existByUser(String email);

    Optional<User> fingByEmail(String email);
}
