package com.department.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.Model.DepartmentEntity;
import com.department.departmentDTO.DepartmentDto;

public interface DepartmentRepository  extends JpaRepository<DepartmentEntity, Integer>{

	List<DepartmentEntity> findByDepartmentName(String departmentName);

}
