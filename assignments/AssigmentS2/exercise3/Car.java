public class Car extends Vehicle {

protected int numDoors = 4;

public Car () {
    super(2007,"Kia");
}

public void setNumDoors(int numDoors) {
    this.numDoors = numDoors;
}

public int getNumDoors() {
    return numDoors;
}

}


