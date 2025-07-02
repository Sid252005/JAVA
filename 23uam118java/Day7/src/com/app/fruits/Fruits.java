package com.app.fruits;

public class Fruits {
    String name;
    String color;
    double weight;
    boolean isFresh;

    public Fruits(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = true;
    }

    @Override 
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

    public String taste() {
        return "no specific taste";
    }
    
    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        this.isFresh = fresh;
    }
      
    
    public String getName() {
        return name;
    }
}
