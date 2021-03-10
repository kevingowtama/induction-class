package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeJoinDepartmentResponse;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeResponse;

import java.util.List;
import java.util.Optional;

public interface EmployeeService{

    Optional<Employees> findById(Integer id);

    List<Employees> findAll();

    EmployeeResponse save(Employees employees);

    List<Employees> findBySalaryGreaterThanAndManagerId(Integer salary, Integer managerId);

    List<Employees> findBySalaryLessThanAndDepartmentId(Integer salary, Integer departmentId);

    List<Employees> findAllWithNativeQuery();

    Optional<Employees> findByIdWithNativeQuery(Integer employeeId);

    List<Employees> findBySalaryGreaterThanAndManagerIdWithNativeQuery(Integer salary, Integer managerId);

    List<Employees> findBySalaryLessThanAndDepartmentIdWithNativeQuery(Integer salary, Integer departmentId);

    List<Employees> findAllJoinDepartment();
}
