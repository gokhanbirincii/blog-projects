package com.example.springexceptiontranslation.Service;

import com.example.springexceptiontranslation.Model.Employee;
import com.example.springexceptiontranslation.Repository.EmployeeDao;
import org.springframework.stereotype.Service;

/**
 * Created on March, 2018
 *
 * @author gokhan
 */
@Service
public class EmployeeService {

	private final EmployeeDao employeeDao;

	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmploye(Employee employee) {
		try {
			employeeDao.addEmployee(employee);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
