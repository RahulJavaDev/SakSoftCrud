package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;
public interface IStudentService {
	Integer saveStudent(Student s);
	List<Student> findAllStudent();
	void deleteId(Integer i);
	Optional<Student> findById(Integer b);
	void updateById(Student s);

}
