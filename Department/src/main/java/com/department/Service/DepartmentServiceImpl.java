package com.department.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.department.Model.DepartmentEntity;
import com.department.Repository.DepartmentRepository;
import com.department.departmentDTO.DepartmentDto;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public DepartmentDto save(DepartmentDto entity) {
		DepartmentEntity departmentEntity = new DepartmentEntity(entity);
	
		LocalDateTime now =LocalDateTime.now();
		departmentEntity.setCreationDateAndTime(now);
		departmentEntity.setUpdationDateAndTime(now);
		return new DepartmentDto(departmentRepository.save(departmentEntity));
	}

	@Override
	public List<DepartmentDto> findAll() {
		List<DepartmentEntity> departmentEntities= departmentRepository.findAll();
		return departmentEntities.stream().map(DepartmentDto::new).collect(Collectors.toList());
	}

	@Override
	public DepartmentDto findById(Integer departmentId) {

		return new DepartmentDto(departmentRepository.findById(departmentId).get());
	}

	@Override
	public List<DepartmentEntity> findByDepartmentName(String departmentName) {
		return departmentRepository.findByDepartmentName(departmentName);
	}

}
