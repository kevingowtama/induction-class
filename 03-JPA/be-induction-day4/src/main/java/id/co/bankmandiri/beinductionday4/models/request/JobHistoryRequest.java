package id.co.bankmandiri.beinductionday4.models.request;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class JobHistoryRequest {

    private Integer employeeId;

    private Timestamp endDate;

    private String jobId;

    private Integer departmentId;
}
