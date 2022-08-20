package com.simpleecommerce.purchaseorderapi.repository;

import com.simpleecommerce.purchaseorderapi.entities.PurchaseOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends MongoRepository<PurchaseOrder, String> {


}