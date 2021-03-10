package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, String> {

    Optional<Job> findById(String Id);

    @Query(nativeQuery = true, value = "SELECT * FROM JOBS j")
    List<Job> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM JOBS j WHERE j.job_id = :jobId")
    Optional<Job> findByIdWithNativeQuery(String jobId);
}
