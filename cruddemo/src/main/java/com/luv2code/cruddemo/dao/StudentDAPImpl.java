package com.luv2code.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAPImpl implements StudentDAO {

  // define filed for entity manager
  private EntityManager entityManager;

  // inject entity manger using constructor injection
  @Autowired
  public StudentDAPImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  @Transactional
  public void save(Student theStudent) {
    entityManager.persist(theStudent);
  }

  @Override
  public Student findById(Integer id) {
    return entityManager.find(Student.class, id);
  }

  @Override
  public List<Student> findAll() {

    // create query
    TypedQuery<Student> query = entityManager.createQuery(
        "FROM Student",
        Student.class);

    // return query results
    return query.getResultList();
  }

  @Override
  public List<Student> findByLastName(String lastName) {

    TypedQuery<Student> query = entityManager.createQuery(
        "FROM Student WHERE lastName=:lastName",
        Student.class);

    query.setParameter("lastName", lastName);

    return query.getResultList();
  }

}
