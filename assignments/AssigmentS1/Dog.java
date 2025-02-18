package assignments.AssigmentS1;

class Dog {
    String name;
    String color; // colour ?
    String breed; 
    int hungry; // If 1 then hungry


    Dog() {
        name = "John Dog";
        color = "Brown";
        breed = "Street dog";
        hungry = 1;

    }

public String bark() {
    return "Woof! Woof!";
}

public String fetch() {
    if (hungry != 1) { // In C if(!hungry) {}
        return "Here's stick!";
    } else {
        return "Too hungry!";
    }
}

public String wag_tail() {
    return "Little wag!";
}

void setName(String name) {
    this.name = name;
}

void setHungry(int hungry) {
    this.hungry = hungry;
}

void setColor(String color) {
    this.color = color;
}

void setBreed(String breed) {
    this.breed = breed;
}

}