package com.book.amazingbookseller.UserRepository;

import com.book.amazingbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
