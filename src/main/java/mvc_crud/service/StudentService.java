package mvc_crud.service;

import java.sql.Date;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc_crud.dao.StudentDao;
import mvc_crud.dto.Student;

@Component
public class StudentService {
	@Autowired
	Student student;
	@Autowired
	StudentDao dao;

	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("Create");
		andView.addObject("student", student);
		return andView;
	}

	public ModelAndView create(Student student, String dob) {
		ModelAndView andView = new ModelAndView("Home");

		student.setDob(Date.valueOf(dob));
		student.setAge(Period.between(student.getDob().toLocalDate(), LocalDate.now()).getYears());

		dao.save(student);
		andView.addObject("msg", "Data Added Successfully");
		return andView;
	}

	public ModelAndView fetch() {
		ModelAndView andView = new ModelAndView("Result");
		andView.addObject("list", dao.fetch());
		return andView;
	}

	public ModelAndView delete(int id) {
		dao.delete(id);
		ModelAndView andView = new ModelAndView("Result");
		andView.addObject("msg", "Data deleted Successfully");
		andView.addObject("list", dao.fetch());
		return andView;
	}

	public ModelAndView edit(int id) {
		ModelAndView andView = new ModelAndView("Edit");
		andView.addObject("student", dao.find(id));
		return andView;
	}

	public ModelAndView update(Student student, String dob) {
		ModelAndView andView = new ModelAndView("Result");

		student.setDob(Date.valueOf(dob));
		student.setAge(Period.between(student.getDob().toLocalDate(), LocalDate.now()).getYears());

		dao.update(student);
		
		andView.addObject("msg", "Data updated Successfully");
		andView.addObject("list",dao.fetch());
		
		return andView;
	}
}