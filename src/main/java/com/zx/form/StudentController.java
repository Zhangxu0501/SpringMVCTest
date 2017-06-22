package com.zx.form;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangxu on 2017/6/20.
 */
@Controller
@RequestMapping("/form")
public class StudentController {
    @RequestMapping(value="/student",method = RequestMethod.GET)
    public ModelAndView student()
    {
        return new ModelAndView("/form/student","command",new Student());
    }
    @RequestMapping(value = "/addstudent",method = RequestMethod.POST)
    public String addStudent(Student student,ModelMap model)
    {
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        return "/form/result";
    }

}
