package service;

import exception.exception.EmployeeAlreadyAddedException;
import exception.exception.EmployeeNotFoundException;
import model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl() {

        this.employeeList = new ArrayList<>();
    }


    @Override
    public Employee add(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)){
           throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeeList.contains(employee)) {

            return employee;
        }
        throw new EmployeeNotFoundException();
    }

