package com.denis.demogame.controller;

import com.denis.demogame.entity.Employee;
import com.denis.demogame.service.api.EmployeeService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Info successfully fetched"),
        @ApiResponse(code = 500, message = "Internal server error"),
})
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<Employee>> getAllUsers() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }
}
