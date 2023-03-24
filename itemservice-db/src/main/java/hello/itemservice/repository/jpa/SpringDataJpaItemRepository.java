package hello.itemservice.repository.jpa;

import hello.itemservice.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpringDataJpaItemRepository extends JpaRepository<Item, Long> {

    //테스트111
    List<Item> findByItemNameLike(String itemName);
    List<Item> findByPriceLessThanEqual(Integer price);
    List<Item> findByItemNameLikeAndPriceLessThanEqual(String itemName, Integer price); // 쿼리메서드
    @Query("select i from Item i where i.itemName like :itemName and i.price <= :price") // 쿼리 직접 실행
    List<Item> findItems(@Param("itemName") String itemName, @Param("price") Integer price);

}
