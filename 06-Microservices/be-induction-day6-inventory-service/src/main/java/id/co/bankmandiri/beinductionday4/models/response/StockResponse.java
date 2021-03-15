package id.co.bankmandiri.beinductionday4.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockResponse {

    private Integer stockId;

    private Integer quantity;

    private Integer itemId;
}
