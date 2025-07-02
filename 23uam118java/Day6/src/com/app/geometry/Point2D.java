package com.app.geometry;


	public class Point2D {
	    private double x;
	    private double y;

	    // ✅ Constructor
	    public Point2D(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    // ✅ Getters
	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    // ✅ Check if two points are the same
	    public boolean isEqual(Point2D other) {
	        return this.x == other.x && this.y == other.y;
	    }

	    // ✅ Calculate distance
	    public double calculateDistance(Point2D other) {
	        double dx = this.x - other.x;
	        double dy = this.y - other.y;
	        return Math.sqrt(dx * dx + dy * dy);
	    }
	}
  

