package com.student.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAddressRepsonses {

	int id;
	String houseNo;
	String laneNo;
	String vlg;
	String mdl;
	String district;
	String pinCode;

}
