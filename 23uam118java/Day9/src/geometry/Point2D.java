package geometry;

public class Point2D {
    private double x;
    private double y;

    
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

 
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }


    public double calculateDistance(Point2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
