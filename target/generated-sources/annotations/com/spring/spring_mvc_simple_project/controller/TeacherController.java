package com.spring.spring_mvc_simple_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.spring_mvc_simple_project.dto.Teacher;
import com.spring.spring_mvc_simple_project.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/")
	public String getHome() {
	
		return "home";
	}
	
	@RequestMapping("/insertTeacher")
	public ModelAndView getTeacherObject() {
		
		ModelAndView andView = new ModelAndView("insert-teacher");
		
		andView.addObject("teacher",new Teacher());
		
		return andView;
	}
	
	@RequestMapping("/saveTeacher")
	public ModelAndView getTeacherObject(Teacher teacher) {
		
		ModelAndView andView = new ModelAndView("insert-teacher");
		
		
		teacherService.saveTeacher(teacher);
		
		return andView;
	}
	@RequestMapping("/displayTeacher")
	public ModelAndView getAllTeacher() {
		
		List<Teacher> teachers=teacherService.getAllTeachers();
		
		ModelAndView andView = new ModelAndView("display-teacher");
		
		andView.addObject("teacherData", teachers);
		
		return andView;
	}
	@RequestMapping("/deleteTeacher")
	public ModelAndView deleteTeacher(@RequestParam int teacherid) {
		ModelAndView  andView = new ModelAndView("display-Teacher");
				teacherService.deleteTeacherBYid(teacherid);
		return andView;
				
	}
	
	

}
