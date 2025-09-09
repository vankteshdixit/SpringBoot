package com.example.demo.controllers;


import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
//@RestController -> it will handle HTTP request]
@RequestMapping(path = "/employee")
public class EmployeeController {
    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeID){
        return new EmployeeDTO(employeeID, "Vanktesh", "dixitvanktesh2003@gmail.com", 22, LocalDate.of(2025, 1, 2),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam Integer age){
        return "Hi age "+age;
    }
}
