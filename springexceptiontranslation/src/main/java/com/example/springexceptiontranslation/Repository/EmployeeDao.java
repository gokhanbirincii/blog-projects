package com.example.springexceptiontranslation.Repository;

import com.example.springexceptiontranslation.Model.Employee;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

/**
 * Created on March, 2018
 *
 * @author gokhan
 */
@Repository
public class EmployeeDao {

	public void addEmployee(Employee user) {
		throw new HibernateException("unchecked");
	}
}
