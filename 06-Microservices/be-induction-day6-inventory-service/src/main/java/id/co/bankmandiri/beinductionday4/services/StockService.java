package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.Stocks;
import id.co.bankmandiri.beinductionday4.models.request.StockRequest;

import java.util.List;
import java.util.Optional;

public interface StockService {

    Optional<Stocks> findById(Integer id);

    List<Stocks> findAll();

    Stocks save(StockRequest stockRequest);
}
