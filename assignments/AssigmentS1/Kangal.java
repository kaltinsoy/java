package assignments.AssigmentS1;

class Kangal extends Dog {
    String Protects;

    Kangal() {
    name = "Aslan Korur";
    color = "Yellow";
    breed = "Protect Dog"; 
    hungry = 0; // If 1 then hungry
    Protects = "Sheep";
    }


public String guard() {
    return "ON DUTY! and Protects: " + Protects;
}

public String wag_tail() {
    return "No wag!";
}

void protectedAnimal(String Protects) {
    this.Protects = Protects;
}

}