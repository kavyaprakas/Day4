package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {
@Autowired
	ApiService service;
@Autowired
	BookRepo repo;

@PutMapping("/book")
	public String update(@RequestBody Book stu) {
		return service.updateDetails(stu);
	}
@DeleteMapping("/delete/{id}")
	public String delete(@RequestParam int id) {
		return service.deleteDetails(id);
	}
}
