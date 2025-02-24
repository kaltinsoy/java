public class demo {
    public static void main(String[] args) {
    Shape circle = new Circle(5.0);
    Shape rectangle = new Rectangle(5.0, 6.0);

    System.out.println("Rectangle one side 5, other side 6");
    System.out.println("Rectangle area: "+ rectangle.calculateArea() + ", Rectangle perimeter: "+ rectangle.calculatePerimeter());
    System.out.println("Circle radius: 5");
    System.out.println("Circle area: "+ circle.calculateArea() + ", Circle perimeter: "+ circle.calculatePerimeter());
    }

}
