package com.xworkz.map.employee;

import com.xworkz.map.employee.dto.EmployeeDto;

import java.nio.file.OpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<EmployeeDto> employeeDtos = new ArrayList<>();

        employeeDtos.add(new EmployeeDto(1, "Tejaswa","D", "IT", "Junior Developer"));
        employeeDtos.add(new EmployeeDto(2,"Tejaswa","Ediga","IT","Junior Developer"));
        employeeDtos.add(new EmployeeDto(3,"Puneeth","Y Devang","Devops","Devops Engineer"));
        employeeDtos.add(new EmployeeDto(4,"Shashank","Mudigodar","Manufacturing","Design Engineer"));
        employeeDtos.add(new EmployeeDto(5,"Gagan","M Patil","Civil","Junior Engineer"));
        employeeDtos.add(new EmployeeDto(6,"Rakshitha","G","Testing","Quality Assurance L1"));

        employeeDtos.stream().map(EmployeeDto::getEmployeeDept).distinct().forEach(System.out::println);

        employeeDtos.stream()
                .sorted(Comparator.comparing(EmployeeDto::getEmployeeFirstName)
                        .thenComparing(Comparator.comparing(EmployeeDto::getEmployeeLastName)))
                .forEach(System.out::println);

//
//        List<Integer> integers = Arrays.asList(34,35,36,37,38,39);
//
//        System.out.println(integers.stream().collect(Collectors.partitioningBy(i -> i%2==

        EmployeeDto dto = new EmployeeDto(6,"Rakshitha","G","Testing","Quality Assurance L1");
        Optional<EmployeeDto> ref = Optional.ofNullable(dto);

        System.out.println(ref);

        System.out.println(ref.get());



    }
}