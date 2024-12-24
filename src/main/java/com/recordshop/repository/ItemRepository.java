package com.recordshop.repository;

import com.recordshop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> , QuerydslPredicateExecutor<Item> ,ItemRepositoryCustom{

    List<Item> findByItemNm(String itemNm);
}
