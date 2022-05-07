package model;

enum ChargerType {
    FAST, NORMAL
}

public class HybridCar extends Automobile
{
    // Attributes
    private double batteryDuration;
    private double batteryConsume;
    private String typeCharger;

    // Constructor
    public HybridCar(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew, 
        String typeAutomobile, double batteryDuration, double batteryConsume,
        String typeCharger
    ) {
        super(basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew, typeAutomobile);
        this.batteryDuration = batteryDuration;
        this.batteryConsume = batteryConsume;
        this.typeCharger = typeCharger;
    }

    // Getters and Setters

    /**
     * @return double return the batteryDuration
     */
    public double getBatteryDuration() {
        return batteryDuration;
    }

    /**
     * @param batteryDuration the batteryDuration to set
     */
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    /**
     * @return double return the batteryConsume
     */
    public double getBatteryConsume() {
        return batteryConsume;
    }

    /**
     * @param batteryConsume the batteryConsume to set
     */
    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }

    /**
     * @return String return the typeCharger
     */
    public String getTypeCharger() {
        return typeCharger;
    }

    /**
     * @param typeCharger the typeCharger to set
     */
    public void setTypeCharger(String typeCharger) {
        this.typeCharger = typeCharger;
    }

    // toString
    public String toString() {
        return "toString HybridCar";
    }
}
