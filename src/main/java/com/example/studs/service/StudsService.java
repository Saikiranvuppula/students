package com.example.studs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studs.Students;
import com.example.studs.repo.StudsRepo;

@Service


public class StudsService
{
	@Autowired
	StudsRepo studsrepo;
	public List<Students> getallstuds() {
		return studsrepo.findAll();
	}
	public Optional<Students> findById(int Rollno)
	{
		return studsrepo.findById(Rollno);
	}
    public void saveorUpdate(Students studs)   
    {
    	studsrepo.save(studs);
    }
    public void delete (int rollno)
    {
        studsrepo.deleteById(rollno);
    }
    public void Update(Students studs)
    {
    studsrepo.save(studs);
    }
	}
	