package edu.mum.cs.cs425.eregistrarcrudlab8.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.eregistrarcrudlab8.model.Student;
import edu.mum.cs.cs425.eregistrarcrudlab8.repository.StudentRepository;
import edu.mum.cs.cs425.eregistrarcrudlab8.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Iterable<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll((Sort.by("studentNumber")));
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return repository.findById(studentId).orElse(null);
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		repository.deleteById(studentId);
	}

}
