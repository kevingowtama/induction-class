package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobResponse {

    private String jobsId;

    private String jobTitle;

    private Integer minSalary;

    private Integer maxSalary;
}
