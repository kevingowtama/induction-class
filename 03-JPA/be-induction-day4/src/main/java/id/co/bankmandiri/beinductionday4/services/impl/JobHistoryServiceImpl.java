package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.entities.JobHistory;
import id.co.bankmandiri.beinductionday4.repositories.JobHistoryRepository;
import id.co.bankmandiri.beinductionday4.services.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {

    @Autowired
    private JobHistoryRepository jobHistoryRepository;

    @Override
    public Optional<JobHistory> findById(Integer id) {
        return jobHistoryRepository.findById(id);
    }

    @Override
    public List<JobHistory> findAllWithNativeQuery() {
        return jobHistoryRepository.findAllWithNativeQuery();
    }

    @Override
    public Optional<JobHistory> findByIdWithNativeQuery(Integer employeeId) {
        return jobHistoryRepository.findByIdWithNativeQuery(employeeId);
    }

    @Override
    public Integer mergeEmployeeToJobHistory() {
        return jobHistoryRepository.mergeEmployeeToJobHistory();
    }

}
