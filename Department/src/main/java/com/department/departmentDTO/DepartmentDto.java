package com.department.departmentDTO;

import java.time.LocalDateTime;

import com.department.Model.DepartmentEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DepartmentDto {
	

	private Integer departmentId;
	private String departmentName;
	private LocalDateTime creationDateAndTime;
	private LocalDateTime updationDateAndTime;
	private String createdPerson;
	private String updatedPerson;
	private Boolean deleted=false;
	
	
	
	public DepartmentDto(DepartmentEntity departmentEntity) {
		super();
		this.departmentId = departmentEntity.getDepartmentId();
		this.departmentName = departmentEntity.getDepartmentName();
		this.creationDateAndTime = departmentEntity.getCreationDateAndTime();
		this.updationDateAndTime = departmentEntity.getCreationDateAndTime();
		this.createdPerson = departmentEntity.getCreatedPerson();
		this.updatedPerson = departmentEntity.getUpdatedPerson();
		this.deleted = departmentEntity.getDeleted();
	}

	
}
