package model;

enum GasolineType {
    EXTRA, CURRENT, DIESEL
}

public class GasolineCar extends Automobile
{
    // Attributes    
    private double tankCapacity;
    private double oilConsume;
    private String typeGasoline;

    // Constructor
    public GasolineCar(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew, 
        String typeAutomobile, double tankCapacity, double oilConsume,
        String typeGasoline
    ) {
        super(basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew, typeAutomobile);
        this.tankCapacity = tankCapacity;
        this.oilConsume = oilConsume;
        this.typeGasoline = typeGasoline;
    }

    // Getters and Setters

    /**
     * @return double return the tankCapacity
     */
    public double getTankCapacity() {
        return tankCapacity;
    }

    /**
     * @param tankCapacity the tankCapacity to set
     */
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    /**
     * @return double return the oilConsume
     */
    public double getOilConsume() {
        return oilConsume;
    }

    /**
     * @param oilConsume the oilConsume to set
     */
    public void setOilConsume(double oilConsume) {
        this.oilConsume = oilConsume;
    }

    /**
     * @return String return the typeGasoline
     */
    public String getTypeGasoline() {
        return typeGasoline;
    }

    /**
     * @param typeGasoline the typeGasoline to set
     */
    public void setTypeGasoline(String typeGasoline) {
        this.typeGasoline = typeGasoline;
    }

    // toString
    public String toString() {
        return "toString GasolineCar";
    }
}
