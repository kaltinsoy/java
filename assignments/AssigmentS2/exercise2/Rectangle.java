class Rectangle implements Shape {

private double n, m;

public Rectangle(double n, double m) {
    this.n = n;
    this.m = m;
}
    public double calculateArea() {
        return n*m;
}

    public double calculatePerimeter() {
        return 2*n+2*m;
}

}
