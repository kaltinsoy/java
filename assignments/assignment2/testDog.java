public class testDog {
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