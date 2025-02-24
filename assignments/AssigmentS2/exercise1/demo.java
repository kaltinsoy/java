public class demo {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3.0, 4.0);
        Point2D p2 = new Point2D(6.0, 8.0);

        System.out.println("Coordinates of p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Coordinates of p2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Distance between p1 and (0, 0): " + p1.distance(0, 0));

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        Point2D midpoint = p1.midpoint(p2);
        System.out.println("Midpoint between p1 and p2: (" + midpoint.getX() + ", " + midpoint.getY() + ")");

        System.out.println("Distance between p1 and p2 :" + Point2D.distance(p1, p2));
    }
}
