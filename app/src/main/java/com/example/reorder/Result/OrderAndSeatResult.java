package com.example.reorder.Result;

public class OrderAndSeatResult {
    int result;
    int oreder_number;
    int order_state;

    public OrderAndSeatResult(int result, int oreder_number, int order_state) {
        this.result = result;
        this.oreder_number = oreder_number;
        this.order_state = order_state;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getOreder_number() {
        return oreder_number;
    }

    public void setOreder_number(int oreder_number) {
        this.oreder_number = oreder_number;
    }

    public int getOrder_state() {
        return order_state;
    }

    public void setOrder_state(int order_state) {
        this.order_state = order_state;
    }
}