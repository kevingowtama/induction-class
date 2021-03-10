package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Integer> {

    Optional<JobHistory> findById(Integer Id);

    @Query(nativeQuery = true, value = "SELECT * FROM JOB_HISTORY jh")
    List<JobHistory> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM JOB_HISTORY jh WHERE jh.employee_id = :employeeId")
    Optional<JobHistory> findByIdWithNativeQuery(Integer employeeId);

    @Modifying
    @Query(nativeQuery = true, value = "MERGE INTO JOB_HISTORY jh" +
            "USING(Select * from EMPLOYEES e)" +
            "ON (jh.EMPLOYEE_ID = e.EMPLOYEE ID)" +
            "WHEN NOT MATCHED THEN" +
            "INSERT INTO jh(EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, MODIFIED_DATE)" +
            "values(e.EMPLOYEE_ID, to_date('01-01-2020'), sysdate, e.JOB_ID, e.DEPARTMENT_ID, CURRENT_TIMESTAMP")
    Integer mergeEmployeeToJobHistory();
}
