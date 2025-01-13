public class Cat {
    protected String name;
    protected String color;


public Cat (String name, String color) {
    this.name = name;
    this.color = color;
}

public String getColor() {
    return color;
}

public String getName() {
    return name;
}

public void setName(String catName) {
    name = catName;
}

public String catSays() {
    return "Meow";
}

}