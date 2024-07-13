package com.department.Service;

import java.util.List;

import com.department.Model.DepartmentEntity;
import com.department.departmentDTO.DepartmentDto;


public interface DepartmentService {
	
	public DepartmentDto save(DepartmentDto entity);
	
	public List<DepartmentDto> findAll();
	
	public DepartmentDto findById(Integer departmentId);
	public List<DepartmentEntity> findByDepartmentName(String department);
}
