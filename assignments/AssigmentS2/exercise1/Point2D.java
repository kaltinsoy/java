public class Point2D {

    private double x, y;



    public Point2D (double x, double y) {
        this.x = x;
        this.y = y;
}

    public double getX() {
        return x;
}

    public double getY() {
        return y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public Point2D midpoint(Point2D p) {
        double midx = (this.x + p.getX()) / 2;
        double midy = (this.y + p.getY()) / 2;
        return new Point2D (midx, midy);
    }
}
