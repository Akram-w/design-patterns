package factoryPattern;

public class GetPlanFactory {

    public Plan getPlan(PlanTypes planType){
        switch (planType){
            case DOMESTIC:
                return  new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                return null;
        }
    }
}
