package com.example.studs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students  
{
@Id
private int Rollno;
private String name;
private String course;
public int getRollno() {
	return Rollno;
}
public void setRollno(int rollno) {
	Rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Students [Rollno=" + Rollno + ", name=" + name + ", course=" + course + "]";
}

}
