package com.example.pineapplestore.feignClient;

import com.example.pineapplestore.Entity.PineappleBatch;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "pineapple-inventory")
public interface InventoryService {
    @RequestMapping("/api/inventory/get-all")
    List<PineappleBatch> getAll();
}
