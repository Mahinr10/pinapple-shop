package com.example.pineappleinventory.FakeDatabase;

import com.example.pineappleinventory.Entity.PineappleBatch;

import java.util.List;

public interface FakeDBService {
    PineappleBatch createNewBatch(PineappleBatch pineappleBatch);

    PineappleBatch updateBatch(String id, PineappleBatch pineappleBatch);

    List<PineappleBatch> getBatchByQuantityOrderByCreatedDate(int quantity);

    List<PineappleBatch> getAllBatch();

    PineappleBatch findById(String id);
}
