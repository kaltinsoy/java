public class Motorcycle extends Vehicle {

protected String engineType;

public Motorcycle () {
    super(2012,"Yamaha");
}

public void setEngineType(String engineType) {
    this.engineType = engineType;
}

public String getEngineType() {
    return engineType;
}

}


