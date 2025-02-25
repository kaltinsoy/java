public class Vehicle {

    protected int year;
    protected String make;


    public Vehicle (int year, String make) {
        this.year = year;
        this.make = make;

    }


    public void setMake(String make) {
        this.make = make;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
