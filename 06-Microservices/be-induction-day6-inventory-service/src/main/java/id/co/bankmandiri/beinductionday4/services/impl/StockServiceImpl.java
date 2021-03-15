package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.entities.Items;
import id.co.bankmandiri.beinductionday4.models.entities.Stocks;
import id.co.bankmandiri.beinductionday4.models.request.ItemRequest;
import id.co.bankmandiri.beinductionday4.models.request.StockRequest;
import id.co.bankmandiri.beinductionday4.repositories.ItemRepository;
import id.co.bankmandiri.beinductionday4.repositories.StockRepository;
import id.co.bankmandiri.beinductionday4.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Optional<Stocks> findById(Integer id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<Stocks> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stocks save(StockRequest newStock) {
        return stockRepository.save(Stocks.builder()
                .quantity(newStock.getQuantity())
                .itemId(newStock.getItemId())
                .build());
    }
}
