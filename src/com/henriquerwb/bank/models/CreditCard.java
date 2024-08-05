package com.henriquerwb.bank.models;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Purchase> itens;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = balance;
        this.itens = new ArrayList<>();
    }

    public boolean launchPurchase(Purchase item) {
        if (this.balance > item.getValue()) {
            this.balance -= item.getValue();
            this.itens.add(item);
            return true;
        }

        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getItens() {
        return itens;
    }
}
