package service;

import exception.exception.EmployeeAlreadyAddedException;
import exception.exception.EmployeeNotFoundException;
import model.Employee;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String,Employee> employees;

    public EmployeeServiceImpl() {this.employees = new HashMap<>();
    }


    @Override
    public Employee add(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employees.containsKey(employee.getFullName())){
           throw new EmployeeAlreadyAddedException();
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employees.containsKey(employee.getFullName())) {
            employees.remove(employee.getFullName());
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employees.containsKey(employee.getFullName())) {

            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}
