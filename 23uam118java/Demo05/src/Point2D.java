package com.app.geometry;

public class Point2D {
    // Instance variables to store x and y coordinates
    private int x;
    private int y;

    // Constructor to initialize x and y
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return point details as a string
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to check if two points are the same
    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point2D otherPoint) {
        int dx = this.x - otherPoint.x;
        int dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
