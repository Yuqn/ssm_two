package com.yuqn.dao;

import com.yuqn.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStu();
    Integer addStu(Student student);
}
