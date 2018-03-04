package com.example.springexceptiontranslation;

import com.example.springexceptiontranslation.Model.Employee;
import com.example.springexceptiontranslation.Repository.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringexceptiontranslationApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test(expected = DataAccessException.class)
	public void whenAttemptToAddEmployee_ifEmployeeIsAnnotatedRepository() {

		Employee employee = new Employee("Gokhan", "Birinci");

		employeeDao.addEmployee(employee);
	}

}
