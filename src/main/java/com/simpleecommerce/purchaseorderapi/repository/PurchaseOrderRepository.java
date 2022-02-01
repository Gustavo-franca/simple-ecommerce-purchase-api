package com.simpleecommerce.purchaseorderapi.repository;

import com.simpleecommerce.purchaseorderapi.entities.PurchaseOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PurchaseOrderRepository extends MongoRepository<PurchaseOrder, String> {

    public PurchaseOrder findByFirstName(String firstName);
    public List<PurchaseOrder> findByLastName(String lastName);

}