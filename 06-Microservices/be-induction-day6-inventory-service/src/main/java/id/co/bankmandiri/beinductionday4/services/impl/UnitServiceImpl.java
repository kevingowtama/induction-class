package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.entities.Units;
import id.co.bankmandiri.beinductionday4.models.request.UnitRequest;
import id.co.bankmandiri.beinductionday4.repositories.UnitRepository;
import id.co.bankmandiri.beinductionday4.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository stockRepository;

    @Override
    public Optional<Units> findById(Integer id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<Units> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Units save(UnitRequest newUnit) {
        return stockRepository.save(Units.builder()
                .name(newUnit.getName())
                .build());
    }
}
