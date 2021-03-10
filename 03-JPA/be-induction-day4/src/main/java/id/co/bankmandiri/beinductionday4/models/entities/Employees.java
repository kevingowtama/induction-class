package id.co.bankmandiri.beinductionday4.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employees {

    @Id
    private Integer employeeId;

    private String firstName ;

    private String lastName;

    private String email;

    private String phoneNumber;

    @Builder.Default
    private Timestamp hireDate = Timestamp.valueOf(LocalDateTime.now());

    private String jobId;

    private Integer salary;

    private Integer commissionPct;

    private Integer managerId;

    private Integer departmentId;

}
