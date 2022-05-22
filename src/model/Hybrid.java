package model;

public class Hybrid extends Car {

    private double tankCapacity;
    private double gasConsumption;
    private double batteryDuration;
    private double batteryConsumption;
    private GasType gasType;
    private Charger charger;

    public Hybrid(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, CarType carType, double tankCapacity, double gasConsumption, double batteryDuration, double batteryConsumption, GasType gasType, Charger charger, TechnicalMechanical review, Soat soat){
        super(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, review, soat);
        this.tankCapacity = tankCapacity;
        this.gasConsumption = gasConsumption;
        this.batteryDuration = batteryDuration;
        this.batteryConsumption = batteryConsumption;
        this.gasType = gasType;
        this.charger = charger;
    }
    

    /**
     * @return dpuble return the tankCapacity
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
     * @return double return the batteryConsumption
     */
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    /**
     * @param batteryConsumption the batteryConsumption to set
     */
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

    public String getId(){

        return id;
    }

    public String informe(){

        return "Hybrid " + carType + "\n" +
               "Combustible type: Battery and Gas\n" + 
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
               "\nNumber of doors: " + numberOfDoors +
               "\n Polarized Windows: " + polarizedWindows+
               "\nCar type: " + carType +
               "\nTank Capacity: " + tankCapacity +
               "\nGas Consumption: " + gasConsumption +
               "\nGas Type: " + gasType + 
               "\nBattery duration: " + batteryDuration +
               "\nBattery consumption: " + batteryConsumption +
               "\nCharger type: " + charger + 
               "\n";
    }
}

