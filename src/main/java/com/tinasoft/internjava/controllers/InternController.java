package com.tinasoft.internjava.controllers;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tinasoft.internjava.models.entities.Intern;
import com.tinasoft.internjava.services.impl_service.InternServiceImpl;

@RestController
@RequestMapping("api/interns")
@CrossOrigin
public class InternController {
	@Autowired
	InternServiceImpl service;
	
	@GetMapping("")
	public List<Intern> getAllIntern() {
		return service.getListInterns();
	}
//	@GetMapping("/{id}")
//	public ResponseEntity<Intern> getInternByUserId(@PathVariable int id) {
//		Intern intern = service.getInternByUserId(id);
//		if(intern == null) System.out.println("null object");
//		return intern != null ? ResponseEntity.ok(intern) : ResponseEntity.notFound().build();
//	}
	@GetMapping("/{id}")
	public Intern getInternByUserId(@PathVariable int id) {
		Intern intern = service.getInternByUserId(id);
		if(intern == null) System.out.println("null object");
		return intern;
	}
	
	@GetMapping("/leader/{id}")
	public List<Intern> getListInternByLeaderID(@PathVariable int id) {
		return service.getListInternsByIdLeader(id);
	}
}
