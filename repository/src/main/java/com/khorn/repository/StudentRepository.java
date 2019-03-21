package com.khorn.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	public StudentRepository() {
		System.out.println("==> StudentRepository Created");
	}
}
