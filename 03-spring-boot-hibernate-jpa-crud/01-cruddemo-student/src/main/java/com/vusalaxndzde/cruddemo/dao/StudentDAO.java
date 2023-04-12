package com.vusalaxndzde.cruddemo.dao;

import com.vusalaxndzde.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

}
