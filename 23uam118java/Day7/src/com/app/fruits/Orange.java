package com.app.fruits;

public class Orange extends Fruits {
    public Orange(String name, double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public String taste() {
        return "sour";
    }
}
