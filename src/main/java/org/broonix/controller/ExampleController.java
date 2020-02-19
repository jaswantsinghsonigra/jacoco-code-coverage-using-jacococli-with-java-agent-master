package org.broonix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping(path = "/test")
    public int exampleMethod(@RequestParam int parameter) {
        if(parameter > 10) {
            return invokeThisBranch(parameter);
        } else {
            return invokeAnotherBranch(parameter);
        }
    }

    private int  invokeThisBranch(int parameter) {
        System.out.println("Taking this branch..");
        if(parameter < 10) {
            System.out.println("This cannot be tested..");
        }
        return 3;
    }

    private int invokeAnotherBranch(int parameter) {
        System.out.println("Taking another branch..");
        return 3;
    }

    @GetMapping("getEmployee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        Employee emp = new Employee();
        emp.setId(id);
        emp.setFirstName("Jaswant");
        emp.setLastName("Singh");
        emp.setDesignation("SSE");

        return emp;
    }

}
