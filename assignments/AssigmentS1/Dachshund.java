package assignments.AssigmentS1;

class Dachshund extends Dog {
    int length = 1000;

    Dachshund() {
        name = "German Sausage";
        color = "Sausage Red";
        breed = "Sausage Dog"; 
        hungry = 0; // If 1 then hungry
    }

    public String SausageLength() {
        return length + " cm";
    }

    void setLength(int length) {
        this.length = length;
    }

    public String wag_tail() {
        return "No wag, doing plank!!!";
    }

}
