package model;

public class Motorcycle extends Vehicle {

    private double gasCapacity;
    private double gasConsumption;
    MotorcycleType motorcycleType;

    public Motorcycle(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, double gasCapacity, double gasConsumption, MotorcycleType motorcycleType, TechnicalMechanical review, Soat soat){
        super(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, review, soat);
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;
        this.motorcycleType = motorcycleType;
    }
    

    /**
     * @return double return the gasCapacity
     */
    public double getGasCapacity() {
        return gasCapacity;
    }

    /**
     * @param gasCapacity the gasCapacity to set
     */
    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    /**
     * @return double return the gasConsumption
     */
    public double getGasConsumption() {
        return gasConsumption;
    }

    /**
     * @param gasConsumption the gasConsumption to set
     */
    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public String getId(){

        return id;
    }

    public MotorcycleType getMotorcycleType(){

        return motorcycleType;
    }

    public double getSalePrice(){

        return salePrice;
    }

    public String informe(){

        return motorcycleType + " Motocylce\n" +
               "Combustible: Gas\n" + 
               "New or used: " + type + "\n" +
               "Sale price:" + salePrice;
    }

    public String toString(){

        return "ID: " + id + 
               "\nBase price: " + basePrice +
               "\nSale price: " + salePrice +
               "\nBrand: " + brand +
               "\nmodel: " + modell +
               "\nDisplacement: " + displacement +
               "\nMileage: " + mileage +
               "\nType: " + type+
               "\nPlaque: " + plaque+
               "\nPropertyCard: " + propertyCard +
               "\nGas Capacity: " + gasCapacity +
               "\nGas Consumption: " + gasConsumption +
               "\nMotorcycle Type: " + motorcycleType + 
               "\n";
    }
}

