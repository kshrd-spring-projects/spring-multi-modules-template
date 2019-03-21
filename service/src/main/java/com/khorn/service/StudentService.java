package com.khorn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khorn.repository.StudentRepository;

@Service
public class StudentService { 
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentService() {
		System.out.println("==> StudentService created");
	}
}
