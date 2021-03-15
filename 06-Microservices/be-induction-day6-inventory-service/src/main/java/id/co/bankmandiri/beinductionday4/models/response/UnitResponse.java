package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnitResponse {

    private Integer unitId;

    private String name;
}
