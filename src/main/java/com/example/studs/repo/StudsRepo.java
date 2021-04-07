package com.example.studs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studs.Students;

public interface StudsRepo extends JpaRepository<Students,Integer>
{

}
