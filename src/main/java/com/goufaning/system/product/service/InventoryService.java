package com.goufaning.system.product.service;

import com.goufaning.system.product.entity.Inventory;
import com.goufaning.system.product.mapper.InventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class InventoryService implements IInventoryService {

    @Autowired
    private InventoryMapper mapper;

    @Override
    public List<Inventory> getAllProductInventory() {
        return mapper.findAll();
    }

    @Override
    public void addProduct(int productId, int num, int warehouseId) {
        mapper.add(productId, num, warehouseId, new Date());
    }
}
