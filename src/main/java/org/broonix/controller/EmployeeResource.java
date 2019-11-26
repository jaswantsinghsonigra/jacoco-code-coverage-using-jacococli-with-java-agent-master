package org.broonix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("employee")
public class EmployeeResource {

	/*@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setFirstName("Vinod");
		emp.setLastName("Kashyap");
		emp.setDesignation("CEO");

		return emp;
	}*/
}
