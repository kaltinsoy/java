// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
public static void main(String[] args)
{
Dog dog = new Yorkshire("Spike");
System.out.println(dog.getName() + " says " + dog.speak());

Dog Ydog = new Yorkshire("NotSpike");
System.out.println(Ydog.getName() + " says " + Ydog.speak());

Dog Ldog = new Labrador("NotSpike","Black");
System.out.println(Ldog.getName() + " says " + Ldog.speak() + " and weights: " + Ldog.avgBreedWeight());
}
}