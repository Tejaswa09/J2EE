package com.xworkz.map.employee.dto;

import lombok.*;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeDept;
    private String designation;

}
