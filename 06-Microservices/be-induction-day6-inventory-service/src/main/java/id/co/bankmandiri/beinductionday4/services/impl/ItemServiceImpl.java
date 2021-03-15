package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.dto.ItemStockDetailDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Items;
import id.co.bankmandiri.beinductionday4.models.request.ItemRequest;
import id.co.bankmandiri.beinductionday4.repositories.ItemRepository;
import id.co.bankmandiri.beinductionday4.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Optional<Items> findById(Integer id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Items> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Items save(ItemRequest newItem) {
        return itemRepository.save(Items.builder()
                .name(newItem.getName())
                .unitId(newItem.getUnitId())
                .build());
    }

    @Override
    public List<ItemStockDetailDTO> findAllItemStockDetail() {
        return itemRepository.findAllItemStockDetail();
    }
}
