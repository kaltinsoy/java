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
        public static void main(String args[]) {
        Dog dog1 = new Dog("Luna");
        Dog dog2 = new Dog("Max");
        Dog dog3 = new Dog("Ashley");

        dog1.setAge(3);
        dog1.setGender("F");
        dog1.setBones(202);

        dog2.setAge(4);
        dog2.setGender("M");
        dog2.setBones(204);

        dog3.setAge(5);
        dog3.setGender("F");
        dog3.setBones(101);

        System.out.println("Dog 1 is called " + dog1.getName());
        System.out.println("Dog 2 has caught " + dog2.getBones() + " bones so far.");
        System.out.println("Dog 3 is " + dog3.dogAgeAsPeopleYears(dog3.getAge()) + " years old in human years.");
        System.out.println("Dog 1 gender: "+ dog1.getGender());
    }
}