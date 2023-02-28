package com.spring.spring_mvc_simple_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.spring_mvc_simple_project.dao.TeacherDao;
import com.spring.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherService {

	@Autowired
	TeacherDao dao;

	// save methodTeacher
	public Teacher saveTeacher(Teacher teacher) {
		
		return dao.saveTeacher(teacher);
	}
	// display Teacher
		public List<Teacher> getAllTeachers() {

			return dao.getAllTeachers();
		}
		public void deleteTeacherBYid(int id) {
			dao.deleteTeacherBYid(id);
		}
}
