package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApiService {
@Autowired
	BookRepo repos;
public String updateDetails(Book stu) {
	repos.save(stu);
	return "update";
}
public String deleteDetails(int id) {
	repos.deleteById(id);;
	return "Id delete";
}
}
