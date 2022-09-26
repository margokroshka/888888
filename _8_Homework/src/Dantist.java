public class Dantist extends Plan {

    String treat = "Вас лечит дантист";

    public String getTreat3() {
        return treat;
    }

    @Override
    void Treat() {
        if (numPlan == 3) {
            System.out.println(getTreat3());
        }
    }
}