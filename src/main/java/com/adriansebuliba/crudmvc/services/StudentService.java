package com.adriansebuliba.crudmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriansebuliba.crudmvc.models.Student;
import com.adriansebuliba.crudmvc.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}
	
	public Optional<Student> getOne(Integer Id) {
		return this.studentRepository.findById(Id);
	}
    
	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer Id) {
		studentRepository.deleteById(Id);
	}
}
