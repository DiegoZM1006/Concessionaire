package model;

enum MotorcycleType {
    ESTANDAR, DEPORTIVA, SCOOTER, CROSS, NONE
}

public class Motorcycle extends Vehicle
{
    // Attributes
    private double oilCapacity;
    private double oilConsume;
    private MotorcycleTypes typeMotorcycle;

    // Constructor
    public Motorcycle(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew, 
        double oilCapacity, double oilConsume, MotorcycleTypes typeMotorcycle
    ) {
        super(basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew);
        this.oilCapacity = oilCapacity;
        this.oilConsume = oilConsume;
        this.typeMotorcycle = typeMotorcycle;
    }

    // Getters and Setters

    /**
     * @return double return the oilCapacity
     */
    public double getOilCapacity() {
        return oilCapacity;
    }

    /**
     * @param oilCapacity the oilCapacity to set
     */
    public void setOilCapacity(double oilCapacity) {
        this.oilCapacity = oilCapacity;
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
     * @return String return the typeMotorcycle
     */
    public MotorcycleTypes getTypeMotorcycle() {
        return typeMotorcycle;
    }

    /**
     * @param typeMotorcycle the typeMotorcycle to set
     */
    public void setTypeMotorcycle(MotorcycleTypes typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
    }

    // toString
    /*
    private double oilCapacity;
    private double oilConsume 
    */
    public String toString() {
        return "** MotorCycle (" + this.typeMotorcycle.name() + ") **\n" +
                super.toString() +
                "Oil capacity: " + oilCapacity + "\n" +
                "Oil consume: " + oilConsume + "\n"
        ;
    }
}
