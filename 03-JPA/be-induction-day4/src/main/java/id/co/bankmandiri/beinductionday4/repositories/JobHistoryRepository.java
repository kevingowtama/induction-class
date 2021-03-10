package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Integer> {

    Optional<JobHistory> findById(Integer Id);

    @Query(nativeQuery = true, value = "SELECT * FROM JOB_HISTORY jh")
    List<JobHistory> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM JOB_HISTORY jh WHERE jh.employee_id = :employeeId")
    Optional<JobHistory> findByIdWithNativeQuery(Integer employeeId);
}
