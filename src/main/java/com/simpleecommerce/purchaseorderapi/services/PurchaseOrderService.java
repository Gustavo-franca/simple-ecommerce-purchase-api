package com.simpleecommerce.purchaseorderapi.services;


import com.simpleecommerce.purchaseorderapi.entities.PurchaseOrder;
import com.simpleecommerce.purchaseorderapi.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {

    @Value("${topic.name.producer}")
    private String  topicName;
    private PurchaseOrderRepository repository;
    private final KafkaTemplate<String,String> kafkaTemplate;

    public PurchaseOrderService(PurchaseOrderRepository repository,final KafkaTemplate<String,String> kafkaTemplate) {
        this.repository = repository;
        this.kafkaTemplate = kafkaTemplate;

    }

    public PurchaseOrder create (PurchaseOrder purchaseOrderRequest) {
        kafkaTemplate.send(topicName,"TESTE");
        return this.repository.save(purchaseOrderRequest);
    }

    public PurchaseOrder update (PurchaseOrder updateRequest) {
        return this.repository.save(updateRequest);
    }

    public PurchaseOrder getById(String id) {
        return this.repository.findById(id).get();
    }

}
