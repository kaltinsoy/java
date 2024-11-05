public class Dog {
    private String dogName;
    private int dogAge;
    private String dogGender;
    private int bones;

    public Dog(String dogName) {
        this.dogName = dogName;
        this.dogAge = 0;
        this.dogGender = "?";
        this.bones = 0;
    }

    public String getName() {
        return dogName;
    }

    public int getAge() {
        return dogAge;
    }

    public void setAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getGender() {
        return dogGender;
    }

    public void setGender(String dogGender) {
        //System.out.println("Enter gender (F/M) !");
        if (dogGender.equals("F") || dogGender.equals("M")) {
            this.dogGender = dogGender.equals("F") ? "Female" : "Male";
        }
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        if(bones >= 0) {
            this.bones = bones;
        }
    }

    public int dogAgeAsPeopleYears(int humanYears) {
        if (humanYears == 1) {
            return 15;
        } else if (humanYears == 2) {
            return 24;
        } else {
            return 24 + (humanYears - 2) * 5;
        }
    }
}