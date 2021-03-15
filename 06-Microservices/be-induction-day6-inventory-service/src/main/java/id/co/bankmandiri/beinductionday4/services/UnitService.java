package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.Units;
import id.co.bankmandiri.beinductionday4.models.request.UnitRequest;

import java.util.List;
import java.util.Optional;

public interface UnitService {


    Optional<Units> findById(Integer id);

    List<Units> findAll();

    Units save(UnitRequest unitRequest);
}
