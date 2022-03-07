package com.siemens.repository;

import com.siemens.entity.Student;

import java.util.List;

/**
 * <p>Create Time: 2022年03月04日 16:07          </p>
 **/
public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(Long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(Long id);
}
