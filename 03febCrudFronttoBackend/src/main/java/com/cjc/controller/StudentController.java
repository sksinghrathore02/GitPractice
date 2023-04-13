package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.StudentService;
@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	StudentService ssr;
	
	@RequestMapping(value = "/savedata",method = RequestMethod.POST)
	public Student savedata(@RequestBody Student s)
	{
		return ssr.savedata(s);
	}
	
	@RequestMapping(value = "/getdata",method = RequestMethod.GET)
	public Iterable<Student> getdata()
	{
		return ssr.getdata();
	}
	
	@RequestMapping(value = "/updatedata",method = RequestMethod.PUT)
	public void updatedata(@RequestBody Student s)
	{
		ssr.savedata(s);
	}
	@RequestMapping(value = "/deletedata/{id}", method = RequestMethod.DELETE)
	public Iterable<Student> deletedata(@PathVariable ("id") int id)
	{
		ssr.deletedata(id);
		return getdata();
	}
}
