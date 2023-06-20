package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepo;

	@GetMapping("/")
	public String getDoctorForm() {
		return "Doctor";
		
	}
	
	@PostMapping("/doctor")
	public String postDoctorForm(@ModelAttribute Doctor doc) {
		
		doctorRepo.save(doc);
		return "Doctor";
	}
	
	
}
