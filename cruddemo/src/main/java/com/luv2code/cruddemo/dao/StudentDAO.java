package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {
  void save(Student theStudent);

  Student findById(Integer id);

  List<Student> findAll();

}
