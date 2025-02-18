package assignments.AssigmentS1;

class DogDemo {
    public static void main(String[] args) {
        Kangal dog1 = new Kangal();
        Dog dog2 = new Kangal();
        Dog dog3 = new Dog();
        Dachshund dog4 = new Dachshund();
    
    System.out.println();
    System.out.println(dog1.name);
    dog1.setHungry(1);
    System.out.println(dog1.wag_tail());
    dog1.protectedAnimal("Chicken");
    System.out.println(dog1.guard());

    System.out.println();

    dog2.setName("Kaplan Korur");
    System.out.println(dog2.name + ", " + dog2.breed + ", " + dog2.color);
    dog2.setHungry(0);
    System.out.println(dog2.wag_tail());
    // System.out.println(dog2.guard()); --> ERROR

    System.out.println();

    System.out.println(dog3.name);
    dog3.setHungry(0);
    System.out.println(dog3.wag_tail());
    System.out.println(dog3.fetch());

    System.out.println();

    System.out.println(dog4.name +", " + dog4.color);
    dog4.setHungry(1);
    System.out.println(dog4.wag_tail()+ " Current length: " + dog4.SausageLength());
    System.out.println(dog4.fetch());
    }
}
