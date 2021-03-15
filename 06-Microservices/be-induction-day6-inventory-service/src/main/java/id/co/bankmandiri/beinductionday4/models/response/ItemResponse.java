package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemResponse {

    private Integer itemId;

    private String name;

    private Integer unitId;
}
