package id.co.bankmandiri.beinductionday4.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobHistory {

    @Id
    private Integer employeeId;

    @Builder.Default
    private Timestamp startDate = Timestamp.valueOf(LocalDateTime.now());

    private Timestamp endDate;

    private String jobId;

    private Integer departmentId;
}
