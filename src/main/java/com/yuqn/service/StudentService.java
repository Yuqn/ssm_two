package com.yuqn.service;

import com.yuqn.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectStu();
    Integer addStu(Student student);
}
