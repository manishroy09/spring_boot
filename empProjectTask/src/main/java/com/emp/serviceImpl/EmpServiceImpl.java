package com.emp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Emp;
import com.emp.repository.EmpRepository;
import com.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	private EmpRepository EmpRepository;
	
	public EmpServiceImpl(EmpRepository EmpRepository) {
		super();
		this.EmpRepository = EmpRepository;
	}

	@Override
	public List<Emp> getAllEmployee() {
		return EmpRepository.findAll();
	}

	@Override
	public Emp saveEmployee(Emp Emp) {
		return EmpRepository.save(Emp);
	}

	@Override
	public Emp getEmployeeById(Long id) {
		return EmpRepository.findById(id).get();
	}

	@Override
	public Emp updateEmployee(Emp Emp) {
		return EmpRepository.save(Emp);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		EmpRepository.deleteById(id);	
	}

}
