package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_testers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tester {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String firstName, lastName, role, framework;

}
