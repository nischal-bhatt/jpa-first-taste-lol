package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="mick")
@Data
public class Student {

	@Id
	@GeneratedValue
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
}
