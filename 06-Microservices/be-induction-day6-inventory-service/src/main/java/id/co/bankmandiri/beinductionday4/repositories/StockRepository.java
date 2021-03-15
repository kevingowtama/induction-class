package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.dto.ItemStockDetailDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stocks, Integer> {

    Optional<Stocks> findById(Integer id);

    @Query(nativeQuery = true, value = "SELECT * FROM STOCKS s")
    List<Stocks> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM STOCKS s WHERE s.stock_id = :id")
    List<Stocks> findByIdWithNativeQuery(Integer id);

}
