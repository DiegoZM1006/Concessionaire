package model;

enum AutomobileType {
    SEDAN, CAMIONETA
}

public abstract class Automobile extends Vehicle 
{
    // Attributes
    private String typeAutomobile;

    // Constructors
    public Automobile(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew, String typeAutomobile
    ) {
        super(basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew);
        this.typeAutomobile = typeAutomobile;
    }

    // Getters and Setters

    /**
     * @return String return the typeAutomobile
     */
    public String gettypeAutomobile() {
        return typeAutomobile;
    }

    /**
     * @param typeAutomobile the typeAutomobile to set
     */
    public void settypeAutomobile(String typeAutomobile) {
        this.typeAutomobile = typeAutomobile;
    }

    // toString
    public String toString() {
        return "toString Automobile";
    }
}
