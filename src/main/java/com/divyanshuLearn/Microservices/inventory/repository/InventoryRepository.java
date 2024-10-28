package com.divyanshuLearn.Microservices.inventory.repository;

import com.divyanshuLearn.Microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    // sprind data jpa is automatically going to write query for this method.
    // so whenever i call this method this will execute the method and send the response.
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}
