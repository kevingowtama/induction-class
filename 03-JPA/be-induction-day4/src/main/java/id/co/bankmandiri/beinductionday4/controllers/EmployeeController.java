package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.models.dto.EmployeesDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Employees;
import id.co.bankmandiri.beinductionday4.models.response.EmployeeJoinDepartmentResponse;
import id.co.bankmandiri.beinductionday4.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Optional<Employees> findById(@PathVariable Integer id){
        return employeeService.findById(id);
    }

    @GetMapping
    public List<Employees> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/salary-greater-than-and-manager-id")
    public List<Employees> findBySalaryGreaterThanAndManagerId(
            @RequestParam(defaultValue = "0") Integer salary,
            @RequestParam(defaultValue = "0") Integer managerId){
        if(managerId.equals(0)){
            return employeeService.findAll();
        }
        return employeeService.findBySalaryGreaterThanAndManagerId(salary, managerId);
    }

    @GetMapping("/salary-less-than-and-department-id")
    public List<Employees> findBySalaryLessThanAndDepartmentId(
            @RequestParam(defaultValue = "0") Integer salary,
            @RequestParam(defaultValue = "0") Integer departmentId){
        if(departmentId.equals(0) || salary.equals(0)){
            return employeeService.findAll();
        }
        return employeeService.findBySalaryLessThanAndDepartmentId(salary, departmentId);
    }

    @GetMapping("/join-department")
    public List<Employees> findAllJoinDepartment(){
        return employeeService.findAllJoinDepartment();
    }

    @GetMapping("/right-join")
    public List<EmployeeJoinDepartmentResponse> findAllDepartmentWithNoEmployee(){
        return employeeService.findAllDepartmentWithNoEmployee();
    }

    @GetMapping("/left-join")
    public List<EmployeeJoinDepartmentResponse> findAllEmployeeWithNoDepartment(){
        return employeeService.findAllEmployeeWithNoDepartment();
    }

    @GetMapping("/outer-join")
    public List<EmployeeJoinDepartmentResponse> findAllEmployeeAndDepartmentThatDontMatchEachOther(){
        return employeeService.findAllEmployeeAndDepartmentThatDontMatchEachOther();
    }

    @GetMapping("/native-query/{id}")
    public Optional<Employees> findByIdWithNativeQuery (@PathVariable Integer id){
        return employeeService.findByIdWithNativeQuery(id);
    }

    @GetMapping("/native-query")
    public List<Employees> findAllWithNativeQuery(){
        return employeeService.findAllWithNativeQuery();
    }

    @GetMapping("/native-query/salary-greater-than-and-manager-id")
    public List<Employees> findBySalaryGreaterThanAndManagerIdWithNativeQuery(
            @RequestParam(defaultValue = "0") Integer salary,
            @RequestParam(defaultValue = "0") Integer managerId){
        if(managerId.equals(0)){
            return employeeService.findAllWithNativeQuery();
        }
        return employeeService.findBySalaryGreaterThanAndManagerIdWithNativeQuery(salary, managerId);
    }

    @GetMapping("/native-query/salary-less-than-and-department-id")
    public List<Employees> findBySalaryLessThanAndDepartmentIdWithNativeQuery(
            @RequestParam(defaultValue = "0") Integer salary,
            @RequestParam(defaultValue = "0") Integer departmentId){
        if(departmentId.equals(0) || salary.equals(0)){
            return employeeService.findAllWithNativeQuery();
        }

        return employeeService.findBySalaryLessThanAndDepartmentIdWithNativeQuery(salary, departmentId);
    }

    @GetMapping("/stream/filter")
    public List<Employees> findAllStreamFilter(@RequestParam Integer salary){
        return employeeService.findAll().stream().filter(e -> e.getSalary() > salary).collect(Collectors.toList());
    }

    @GetMapping("/stream/sorted")
    public List<Employees> findAllStreamSorted(){
        return employeeService.findAll().stream().sorted(Comparator.comparing(Employees::getLastName).reversed()).collect(Collectors.toList());
    }

    @GetMapping("/stream/filter-sort")
    public List<Employees> findAllStreamFilterSorted(@RequestParam Integer salary){
        return employeeService.findAll().stream().filter(e -> e.getSalary() > salary).sorted().collect(Collectors.toList());
    }

    @GetMapping("/stream/map")
    public List<EmployeesDTO> findAllStreamMap(){
        return employeeService.findAll().stream().map(e ->
                EmployeesDTO.builder()
                .fullName(e.getFirstName() + " " + e.getLastName())
                .build()).collect(Collectors.toList());

    }

    @GetMapping("/stream/findFirst")
    public Employees findAllStreamFindFirst(@RequestParam Integer length){
        return employeeService.findAll().stream().filter(e -> e.getFirstName().length() > length).findFirst().get();

    }

    @GetMapping("/stream/anyMatch")
    public Boolean findAllStreamAnyMatch(){
        return employeeService.findAll().stream().anyMatch(e -> e.getDepartmentId() == null);

    }


}
