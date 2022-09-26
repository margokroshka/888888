import Animal.Animal;

public class Main {
    public static void main(String[] args) {
        main1();
    }

    public static void main1() {
        Patient patient1 = new Patient("Lola", 1);
        Patient patient2 = new Patient("Lilo", 2);
        Patient patient3 = new Patient("Lali", 3);

        TestPlan testPlan = new TestPlan();
        testPlan.save(patient1);
        testPlan.save(patient2);
        testPlan.save(patient3);

        testPlan.info(2);

    }

}