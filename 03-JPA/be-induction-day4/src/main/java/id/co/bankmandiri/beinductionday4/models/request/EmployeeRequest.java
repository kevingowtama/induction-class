package id.co.bankmandiri.beinductionday4.models.request;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class EmployeeRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Timestamp hireDate;

    private String jobId;

    private Integer salary;

    private Integer commissionPct;

    private Integer managerId;

    private Integer departmentId;
}
