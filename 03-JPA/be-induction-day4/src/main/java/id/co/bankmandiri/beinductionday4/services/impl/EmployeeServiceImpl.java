package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeJoinDepartmentResponse;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeResponse;
import id.co.bankmandiri.beinductionday4.repositories.EmployeeRepository;
import id.co.bankmandiri.beinductionday4.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Optional<Employees> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Optional<Employees> findByIdWithNativeQuery(Integer id) {
        return employeeRepository.findByIdWithNativeQuery(id);
    }

    @Override
    public List<Employees> findBySalaryGreaterThanAndManagerIdWithNativeQuery(Integer salary, Integer managerId) {
        return employeeRepository.findBySalaryGreaterThanAndManagerIdWithNativeQuery(salary, managerId);
    }

    @Override
    public List<Employees> findBySalaryLessThanAndDepartmentIdWithNativeQuery(Integer salary, Integer departmentId) {
        return employeeRepository.findBySalaryLessThanAndDepartmentIdWithNativeQuery(salary, departmentId);
    }

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employees> findBySalaryGreaterThanAndManagerId(Integer salary, Integer managerId) {
        return employeeRepository.findBySalaryGreaterThanAndManagerId(salary, managerId);
    }

    @Override
    public List<Employees> findBySalaryLessThanAndDepartmentId(Integer salary, Integer departmentId) {
        return employeeRepository.findBySalaryLessThanAndDepartmentId(salary, departmentId);
    }

    @Override
    public List<Employees> findAllWithNativeQuery() {
        return employeeRepository.findAllWithNativeQuery();
    }

    @Override
    public List<Employees> findAllJoinDepartment(){
        return employeeRepository.findAllJoinDepartment();
    }

    @Override
    public EmployeeResponse save(Employees employees) {
        return null;
    }
}
