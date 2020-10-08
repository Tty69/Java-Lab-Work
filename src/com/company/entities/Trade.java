package com.company.entities;

public class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public Trade(String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String toString(){
        return ("Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}');
    }
}
