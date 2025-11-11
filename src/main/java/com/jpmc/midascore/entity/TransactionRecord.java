package com.jpmc.midascore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TransactionRecord {
    @Id
    @GeneratedValue()
    private long id;

    private float amount;
    @ManyToOne
    private UserRecord fromUser;
    public TransactionRecord() {
    }
    public TransactionRecord(float amount, UserRecord fromUser) {
        this.amount = amount;
        this.fromUser = fromUser;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return String.format("Transaction[id=%d, amount='%f', fromUser='%s']", id, amount, fromUser.getName());
    }
}
