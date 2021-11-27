package com.yuqn.controller;

import com.yuqn.entity.Student;
import com.yuqn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/addStu")
    public ModelAndView addStu(Student student){
        Integer num=Integer.valueOf(studentService.addStu(student));
        ModelAndView mv=new ModelAndView();
        mv.addObject("num",num);
        mv.setViewName("/addStu");
        return mv;
    }
    @RequestMapping(value = "/selectStu")
    public ModelAndView selectStu(){
        List<Student> students=studentService.selectStu();
        return null;
    }
}
