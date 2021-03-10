package id.co.bankmandiri.beinductionday4.models.request;

import lombok.Data;

import javax.persistence.Id;

@Data
public class DepartmentRequest {

    private String departmentName;

    private Integer managerId;

    private Integer locationId;
}
