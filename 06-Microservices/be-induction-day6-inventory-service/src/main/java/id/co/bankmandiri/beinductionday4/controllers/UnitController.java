package id.co.bankmandiri.beinductionday4.controllers;


import id.co.bankmandiri.beinductionday4.models.entities.Units;
import id.co.bankmandiri.beinductionday4.models.request.UnitRequest;
import id.co.bankmandiri.beinductionday4.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/units")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping("/{id}")
    public Optional<Units> findById(@PathVariable Integer id){
        return unitService.findById(id);
    }

    @GetMapping
    public List<Units> findAll(){
        return unitService.findAll();
    }

    @PostMapping
    public Units save(@RequestBody UnitRequest unitRequest){
        return unitService.save(unitRequest);
    }
}
