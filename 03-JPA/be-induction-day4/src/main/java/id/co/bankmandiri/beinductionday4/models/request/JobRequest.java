package id.co.bankmandiri.beinductionday4.models.request;

import lombok.Data;

@Data
public class JobRequest {

    private String jobsId;

    private String jobTitle;

    private Integer minSalary;

    private Integer maxSalary;
}
