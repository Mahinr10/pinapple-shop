package com.example.pineappleinventory.controller;

import com.example.pineappleinventory.Entity.PineappleBatch;
import com.example.pineappleinventory.FakeDatabase.FakeDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    FakeDBService fakeDBService;

    @PostMapping("/create")
    public ResponseEntity<PineappleBatch> create(@RequestBody PineappleBatch pineappleBatch) {
        return new ResponseEntity<>(fakeDBService.createNewBatch(pineappleBatch), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<PineappleBatch>> findAll() {
        return new ResponseEntity<>(fakeDBService.getAllBatch(), HttpStatus.ACCEPTED);
    }
}
