class Circle implements Shape {

private double n;

    public Circle(double n) {
    this.n = n;
    }

    public double calculateArea() {
        return 3*n*n;

}

    public double calculatePerimeter() {
        return 2*3*n;
}

}
