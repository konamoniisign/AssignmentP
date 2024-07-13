package com.department.Model;

import java.time.LocalDateTime;

import com.department.departmentDTO.DepartmentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer departmentId;
	private String departmentName;
	private LocalDateTime creationDateAndTime;
	private LocalDateTime updationDateAndTime;
	private String createdPerson;
	private String updatedPerson;
	private Boolean deleted=false;
	
	
	public DepartmentEntity(DepartmentDto departmentDto) {
		super();
		this.departmentId = departmentDto.getDepartmentId();
		this.departmentName = departmentDto.getDepartmentName();
		this.creationDateAndTime = departmentDto.getCreationDateAndTime();
		this.updationDateAndTime = departmentDto.getCreationDateAndTime();
		this.createdPerson = departmentDto.getCreatedPerson();
		this.updatedPerson = departmentDto.getUpdatedPerson();
		this.deleted = departmentDto.getDeleted();
	}

}
