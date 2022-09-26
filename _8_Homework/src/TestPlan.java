public class TestPlan {
    Plan[] plans=new Plan[3];

    void save(Plan number){
        for (int i = 0; i < plans.length; i++) {
            if(plans[i]==null){
                plans[i]=number;
                break;
            }
        }
    }
    void info(int i){ plans[i].Treat(); }
}
