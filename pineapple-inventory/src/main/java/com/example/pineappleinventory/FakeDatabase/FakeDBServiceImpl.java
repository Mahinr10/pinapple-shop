package com.example.pineappleinventory.FakeDatabase;

import com.example.pineappleinventory.Entity.PineappleBatch;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FakeDBServiceImpl implements FakeDBService {
    Map<String, PineappleBatch> fakeDB;

    public FakeDBServiceImpl() {
        fakeDB = new HashMap<>();
    }


    @Override
    public PineappleBatch createNewBatch(PineappleBatch pineappleBatch) {
        if(fakeDB.containsKey(pineappleBatch.getId())) {
            return null;
        }
        fakeDB.put(pineappleBatch.getId(), pineappleBatch);
        return fakeDB.getOrDefault(pineappleBatch.getId(), null);
    }

    @Override
    public PineappleBatch updateBatch(String id, PineappleBatch pineappleBatch) {
        return null;
    }

    @Override
    public List<PineappleBatch> getBatchByQuantityOrderByCreatedDate(int quantity) {
        return null;
    }

    @Override
    public List<PineappleBatch> getAllBatch() {
        return new ArrayList<>(fakeDB.values());
    }

    @Override
    public PineappleBatch findById(String id) {
        return fakeDB.getOrDefault(id, null);
    }
}
