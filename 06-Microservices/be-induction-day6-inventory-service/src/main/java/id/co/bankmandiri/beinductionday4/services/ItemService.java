package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.dto.ItemStockDetailDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Items;
import id.co.bankmandiri.beinductionday4.models.request.ItemRequest;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    Optional<Items> findById(Integer id);

    List<Items> findAll();

    Items save(ItemRequest itemRequest);

    List<ItemStockDetailDTO> findAllItemStockDetail();
}
