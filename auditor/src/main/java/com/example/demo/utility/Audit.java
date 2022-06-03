package com.example.demo.utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Audit {
	
	private String firstName, role, lastName;
	private String[] stack;

}
