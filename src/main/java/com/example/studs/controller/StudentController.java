package com.example.studs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studs.Students;
import com.example.studs.exception.StudentNotFoundException;
import com.example.studs.service.StudsService;

@RestController
public class StudentController
{
	@Autowired
	StudsService studsservice;
@GetMapping("/studs")
public List<Students> getallstuds()
{
	return studsservice.getallstuds();
}
@GetMapping("/studs/{rollno}")
public Optional<Students> getstuds(@PathVariable("rollno") int rollno)
{
	return studsservice.findById(rollno).
			orElseThrow(() -> new StudentNotFoundException("student not found with thst rollno:"+rollno));
			
}
@PostMapping("/studs")
public void saveStudents(@RequestBody Students studs)   
{
	studsservice.saveorUpdate(studs);
}
@PutMapping("/studs")
	public Students update(@RequestBody Students studs)
	{
		studsservice.saveorUpdate(studs);
		return studs;
	}
@DeleteMapping("/studs")
public void Delete(int rollno)
{
		studsservice.delete(rollno);	
		orElseThrow(() -> new StudentNotFoundException("student not found with thst rollno:"+rollno));
		
}

	
}
 
