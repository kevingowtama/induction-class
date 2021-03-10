package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.Department;
import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    Optional<Department> findById(Integer id);

    @Query(nativeQuery = true, value = "SELECT * FROM DEPARTMENT d")
    List<Employees> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM DEPARTMENTS d WHERE d.department_id = :departmentId")
    Optional<Employees> findByIdWithNativeQuery(Integer departmentId);
}
