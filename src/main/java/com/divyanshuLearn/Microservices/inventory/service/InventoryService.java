package com.divyanshuLearn.Microservices.inventory.service;

import com.divyanshuLearn.Microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private  final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity) {
        // find an inventory by skuCode and quantity where quality is >= 0

       return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
