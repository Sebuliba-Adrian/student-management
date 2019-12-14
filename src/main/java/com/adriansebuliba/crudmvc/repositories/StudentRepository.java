package com.adriansebuliba.crudmvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.adriansebuliba.crudmvc.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
