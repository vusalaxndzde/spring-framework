package com.vusalaxndzde.cruddemo.dao;

import com.vusalaxndzde.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

}
