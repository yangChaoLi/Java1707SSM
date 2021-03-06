package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService{
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public void deletById(int id) {
		studentDao.deletById(id);
	}

	@Override
	public Student findById(int id) {
		return studentDao.findById(id);
	}

	@Override
	public void add(Student student) {
		studentDao.add(student);
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

}
