package com.henriquerwb.bank.models;

public class Purchase {
    private String itemName;
    private double value;

    public Purchase(String itemName, double value) {
        this.itemName = itemName;
        this.value = value;
    }

    public String getItemName() {
        return itemName;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Nome do item: " + this.itemName + " Valor do item: " + "R$" + this.value;
    }
}
