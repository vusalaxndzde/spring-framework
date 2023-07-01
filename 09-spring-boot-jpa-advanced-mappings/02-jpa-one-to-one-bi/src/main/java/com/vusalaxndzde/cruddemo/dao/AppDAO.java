package com.vusalaxndzde.cruddemo.dao;

import com.vusalaxndzde.cruddemo.entity.Instructor;
import com.vusalaxndzde.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);

}
