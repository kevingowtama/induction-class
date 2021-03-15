package id.co.bankmandiri.beinductionday4.repositories;

import id.co.bankmandiri.beinductionday4.models.dto.ItemStockDetailDTO;
import id.co.bankmandiri.beinductionday4.models.entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

    Optional<Items> findById(Integer Id);

    @Query(nativeQuery = true, value = "SELECT * FROM ITEMS i")
    List<Items> findAllWithNativeQuery();

    @Query(nativeQuery = true, value = "SELECT * FROM ITEMS i WHERE i.item_id = :id")
    List<Items> findByIdWithNativeQuery(Integer id);

    @Query(nativeQuery = true, value = "SELECT i.name AS itemName, SUM(s.quantity) as totalQuantity FROM items i " +
            "JOIN stocks s ON i.item_id = s.item_id GROUP BY i.name")
    List<ItemStockDetailDTO> findAllItemStockDetail();

}
