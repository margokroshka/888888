public class Therapist extends Plan {
    String treat = "Вас лечит терапевт";

    public String getTreat2 (){
return treat;
    }

    @Override
    void Treat() {
        if (numPlan == 2) {
            System.out.println(getTreat2());
        }
    }
}
