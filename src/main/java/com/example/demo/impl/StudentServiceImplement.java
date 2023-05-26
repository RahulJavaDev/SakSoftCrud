package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.IStudentService;
@Service
public class StudentServiceImplement implements IStudentService{
	@Autowired
	StudentRepository repo;

	@Override
	public Integer saveStudent(Student s) {
		
		s=repo.save(s);
		return s.getId();
	}

	@Override
	public List<Student> findAllStudent() {

		List<Student> stu=repo.findAll();
		return stu;
	}
	@Override
	public void deleteId(Integer n)
	{
		if(repo.existsById(n))
		{
		repo.deleteById(n);
		}
	}
	@Override
	public  Optional<Student> findById(Integer m)
	{
		Optional<Student> v=repo.findById(m);
		return v;
	}

	@Override
	public void updateById(Student s)
	{

		if(repo.existsById(s.getId()))
		{
			repo.save(s);	
		}
	}

}
