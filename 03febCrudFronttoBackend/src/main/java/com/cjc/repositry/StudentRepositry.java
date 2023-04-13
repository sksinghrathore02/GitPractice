package com.cjc.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface StudentRepositry  extends CrudRepository<Student, Integer>
{

}
