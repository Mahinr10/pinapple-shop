package com.example.pineappleinventory.controller;

import com.example.pineappleinventory.FakeDatabase.FakeDBService;
import com.example.pineappleinventory.FakeDatabase.PineappleBatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
