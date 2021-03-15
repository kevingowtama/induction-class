package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.models.entities.Stocks;
import id.co.bankmandiri.beinductionday4.models.request.StockRequest;
import id.co.bankmandiri.beinductionday4.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{id}")
    public Optional<Stocks> findById(@PathVariable Integer id){
        return stockService.findById(id);
    }

    @GetMapping
    public List<Stocks> findAll(){
        return stockService.findAll();
    }

    @PostMapping
    public Stocks save(@RequestBody StockRequest stockRequest){
        return stockService.save(stockRequest);
    }
}
