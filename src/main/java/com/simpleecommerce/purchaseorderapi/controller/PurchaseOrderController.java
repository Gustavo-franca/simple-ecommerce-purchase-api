package com.simpleecommerce.purchaseorderapi.controller;

import com.simpleecommerce.purchaseorderapi.entities.PurchaseOrder;
import com.simpleecommerce.purchaseorderapi.services.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase/order")
public class PurchaseOrderController {

    PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    @PostMapping("/")
    public ResponseEntity<PurchaseOrder> create(@RequestBody PurchaseOrder dto) throws Exception {
        var response = this.purchaseOrderService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{purchaseOrderId}")
    public ResponseEntity<PurchaseOrder> getById(@PathVariable String purchaseOrderId) throws Exception {
        var response = this.purchaseOrderService.getById(purchaseOrderId);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping("/")
    public ResponseEntity<PurchaseOrder> update(@RequestBody PurchaseOrder dto) throws Exception {
        var response = purchaseOrderService.update(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}