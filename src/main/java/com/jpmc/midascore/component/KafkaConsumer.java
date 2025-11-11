package com.jpmc.midascore.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.jpmc.midascore.foundation.Transaction;

@Component
public class KafkaConsumer {
    
    @KafkaListener(topics = "${general.kafka-topic}", groupId = "myGroup")
    public void listen(Transaction transaction) {
        System.out.println("=== CONSUMER RECEIVED TRANSACTION ===");
        System.out.println("Received transaction: " + transaction);
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("=====================================");
        // Set breakpoint here to inspect transaction amounts
    }
}
