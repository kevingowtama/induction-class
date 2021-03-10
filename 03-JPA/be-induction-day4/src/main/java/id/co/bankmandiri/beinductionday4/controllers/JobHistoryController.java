package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.models.entities.JobHistory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job-history")
public class JobHistoryController {

    @GetMapping
    List<JobHistory> findAll(){
        return null;
    }
}
