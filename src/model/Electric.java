package model;

public class Electric extends Car {

    private double batteryDuration;
    private double batteryConsumption;
    private Charger charger;

    public Electric(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, CarType carType, double batteryDuration, double batteryConsumption, Charger charger, TechnicalMechanical review, Soat soat){

        super(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, review, soat);
        this.batteryDuration = batteryDuration;
        this.batteryConsumption = batteryConsumption;
        this.charger = charger;
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
     * @return double return the batteryConsumptions
     */
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    /**
     * @param batteryConsumptions the batteryConsumptions to set
     */
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

    public String getId(){

        return id;
    }

    public String informe(){

        return "Electric " + carType + "\n" +
               "Combustible type: Battery\n" + 
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
               "\nBattery duration: " + batteryDuration +
               "\nBattery Consumption: " + batteryConsumption +
               "\nCharger type: " + charger + 
               "\n";
    }

}
