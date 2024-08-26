package factoryPattern;

public class Main {

    public  static void main(String[] args){
        // USE THIS PATTER FOR DB CONNECTION OR LOGGER OR SIMILAR SCENARIOS
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        
        // DOMESTIC bill example
        Plan domesticPlan = getPlanFactory.getPlan(PlanTypes.DOMESTIC);

        double domesticRate = domesticPlan.calculateBill(100);
        System.out.println("Rate for 100 units in DOMESTIC is : "+ domesticRate);

        // COMMERCIAL bill example
        Plan commercialPlan = getPlanFactory.getPlan(PlanTypes.COMMERCIAL);

        double commercialRate = commercialPlan.calculateBill(100);
        System.out.println("Rate for 100 units in COMMERCIAL is : "+commercialRate);
    }
}
