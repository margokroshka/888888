public class Patient extends Plan {
    String patient;
Surgeon a=new Surgeon();
Therapist b=new Therapist();
Dantist c=new Dantist();

    public Patient(String patient, int numPlan) {
        this.numPlan=numPlan;
        this.patient = patient;
    }
    @Override
    void Treat() {
       if (numPlan==1){
           System.out.println(a.getTreat1());
       } else if (numPlan==2) {
           System.out.println(b.getTreat2());
       } else if (numPlan==3) {
           System.out.println(c.getTreat3());
       }
    }

}
