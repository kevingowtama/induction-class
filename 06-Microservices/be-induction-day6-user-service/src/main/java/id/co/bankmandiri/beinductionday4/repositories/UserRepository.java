package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findById(Integer Id);

    @Query(nativeQuery = true, value = "SELECT * FROM USERS u")
    List<Users> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM USERS u WHERE u.user_id = :id")
    List<Users> findByIdWithNativeQuery(Integer id);

}
