package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.models.dto.ItemStockDetailDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Items;
import id.co.bankmandiri.beinductionday4.models.request.ItemRequest;
import id.co.bankmandiri.beinductionday4.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/{id}")
    public Optional<Items> findById(@PathVariable Integer id){
        return itemService.findById(id);
    }

    @GetMapping
    public List<Items> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/stock-remaining")
    public List<ItemStockDetailDTO> findAllItemStockDetail(){
        return itemService.findAllItemStockDetail();
    }

    @PostMapping
    public Items save(@RequestBody ItemRequest itemRequest){
        return itemService.save(itemRequest);
    }

}
