package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UnitRepository extends JpaRepository<Units, Integer> {

    Optional<Units> findById(Integer id);

    @Query(nativeQuery = true, value = "SELECT * FROM UNITS u")
    List<Units> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM UNITS u WHERE u.unit_id = :id")
    List<Units> findByIdWithNativeQuery(Integer id);
}
