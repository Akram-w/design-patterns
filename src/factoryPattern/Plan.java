package factoryPattern;

abstract class Plan {
    abstract double getRate();

    public double calculateBill(int units){
        return units * getRate();
    }
}