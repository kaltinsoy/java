public class HumanTest {
    public static void main(String[] args) {
        Worker worker = new Worker("Koray", "Altinsoy", "Embedded Systems Engineer");
        System.out.println("First name: "+worker.getFName()+", Last Name: "+
        worker.getLName()+", Job Title:"+worker.getJobTitle());
    }
}
