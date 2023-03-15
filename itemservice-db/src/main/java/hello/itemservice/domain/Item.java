package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //JPA가 사용하는 객체 -> 이 어노테이션을 통해 JPA가 인식이 가능
public class Item {
    // @Id : 테이블의 PK와 해당 필드를 매핑 @GeneratedValue(~~~) : PK 생성 값을 데이터베이스 방식을 따름 (auto increment같은..)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_name", length = 10) // 객체와 테이블 컬럼명이 다를 때 사용
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
