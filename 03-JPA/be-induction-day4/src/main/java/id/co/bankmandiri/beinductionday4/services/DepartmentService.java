package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.Department;
import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import id.co.bankmandiri.beinductionday4.models.response.DepartmentResponse;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Optional<Department> findById(Integer id);

    List<Department> findAll();

    DepartmentResponse save(Employees employees);
}
