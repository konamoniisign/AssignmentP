package com.sms.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studentId;
	String  firstName;
	String lastName;
	String userName;
	String city;
	String zip;
	String email;
	String password;
	


}
