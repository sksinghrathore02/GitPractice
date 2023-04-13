package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repositry.StudentRepositry;
import com.cjc.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	StudentRepositry sr;
	@Override
	public Student savedata(Student s) {
		// TODO Auto-generated method stub
		return  sr.save(s);
	}

	@Override
	public Iterable<Student> getdata() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void updatedata(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public Iterable<Student> deletedata(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		return getdata();
	}

}
