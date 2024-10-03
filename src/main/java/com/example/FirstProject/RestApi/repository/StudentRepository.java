package com.example.FirstProject.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FirstProject.RestApi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
