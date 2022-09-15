package com.student.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentbackend.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
