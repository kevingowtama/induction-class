package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentResponse {

    private Integer departmentId;

    private String departmentName;

    private Integer managerId;

    private Integer locationId;
}
