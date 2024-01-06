package com.example.pineapplestore.Controller;

import com.example.pineapplestore.Entity.PineappleBatch;
import com.example.pineapplestore.feignClient.InventoryService;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping("/get-inventory")
    public ResponseEntity<List<PineappleBatch>> getAllPineappleBatch() {
        return inventoryService.getAll();
    }

}
