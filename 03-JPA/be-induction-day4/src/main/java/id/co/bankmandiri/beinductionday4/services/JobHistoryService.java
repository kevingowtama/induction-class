package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.JobHistory;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JobHistoryService {

    Optional<JobHistory> findById(Integer id);

    List<JobHistory> findAllWithNativeQuery();

    Optional<JobHistory> findByIdWithNativeQuery(Integer employeeId);

    Integer mergeEmployeeToJobHistory();

}
