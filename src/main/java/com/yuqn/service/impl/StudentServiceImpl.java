package com.yuqn.service.impl;

import com.yuqn.dao.StudentDao;
import com.yuqn.entity.Student;
import com.yuqn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> selectStu() {
        List<Student> students=studentDao.selectStu();
        return students;
    }

    @Override
    public Integer addStu(Student student) {
        Integer num=studentDao.addStu(student);
        return num;
    }

}
