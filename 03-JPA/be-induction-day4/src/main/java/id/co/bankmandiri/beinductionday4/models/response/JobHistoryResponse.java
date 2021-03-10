package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
public class JobHistoryResponse {

    private Integer employeeId;

    private Timestamp startDate = Timestamp.valueOf(LocalDateTime.now());

    private Timestamp endDate;

    private String jobId;

    private Integer departmentId;
}
