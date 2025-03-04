public class TupleDemo {

    public static void main(String[] args) {


        Tuple <String, Integer, String> personTuple = new Tuple("John Doe", 21, "CS student");
        Tuple <String, Double, Boolean> itemTuple = new Tuple("Tablet", 13123, 1);

        System.out.println(personTuple.getItem1() + personTuple.getItem2() + personTuple.getItem3());
   }
}
