package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeJoinDepartmentResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    Optional<Employees> findById(Integer Id);

    List<Employees> findBySalaryGreaterThanAndManagerId(Integer salary, Integer managerId);

    List<Employees> findBySalaryLessThanAndDepartmentId(Integer salary, Integer departmentId);

    @Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES e")
    List<Employees> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES e WHERE e.employee_id = :employeeId")
    Optional<Employees> findByIdWithNativeQuery(Integer employeeId);

    @Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES e WHERE e.salary > :salary AND e.manager_id = :managerId")
    List<Employees> findBySalaryGreaterThanAndManagerIdWithNativeQuery(Integer salary, Integer managerId);

    @Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES e WHERE e.salary < :salary AND e.department_id = :departmentId")
    List<Employees> findBySalaryLessThanAndDepartmentIdWithNativeQuery(Integer salary, Integer departmentId);


    // JOIN QUERY

    @Query(nativeQuery = true, value = "SELECT * FROM EMPLOYEES e JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID")
    List<Employees> findAllJoinDepartment();

    @Query(nativeQuery = true, value = "SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME FROM DEPARTMENTS d " +
            "RIGHT JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID " +
            "WHERE e.DEPARTMENT_ID IS NULL")
    List<EmployeeJoinDepartmentResponse> findAllDepartmentWithNoEmployee();

    @Query(nativeQuery = true, value = "SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME  FROM DEPARTMENTS d " +
            "LEFT JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID " +
            "WHERE e.DEPARTMENT_ID IS NULL")
    List<EmployeeJoinDepartmentResponse> findAllEmployeeWithNoDepartment();

    @Query(nativeQuery = true, value = "SELECT e.FIRST_NAME, e.LAST_NAME, d.DEPARTMENT_NAME  FROM DEPARTMENTS d " +
            "FULL OUTER JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID " +
            "WHERE e.DEPARTMENT_ID IS NULL OR WHERE d.DEPARTMENT_ID IS NULL")
    List<EmployeeJoinDepartmentResponse> findAllEmployeeAndDepartmentThatDontMatchEachOther();

}
