package com.siemens.controller;

import com.siemens.entity.Student;
import com.siemens.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Create Time: 2022年03月04日 16:29          </p>
 **/

@RestController
public class StudentHandler {

   // @Autowired
    @Resource
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
      return  studentRepository.findById(id);
    }

   @PostMapping("/save")
    public void save(@RequestBody  Student student){
        studentRepository.save(student);
   }


   @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.update(student);
   }

}
