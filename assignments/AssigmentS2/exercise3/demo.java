public class demo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorcycle motor1 = new Motorcycle();

        car1.setYear(2012);
        System.out.println(car1.getYear());
        System.out.println(car1.getNumDoors());

        motor1.setEngineType("Gasoline");
        System.out.println(motor1.getEngineType());


    }

}
