package id.co.bankmandiri.beinductionday4.models.response;

import id.co.bankmandiri.beinductionday4.models.entities.Department;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class EmployeeJoinDepartmentResponse {

    private Integer employeeId;

    private String firstName;

    private String lastName;

    private Integer departmentId;
}
