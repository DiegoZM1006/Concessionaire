package model;

public class Gas extends Car {

    private double tankCapacity;
    private double gasConsumption;
    private GasType gasType;

    public Gas(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, CarType carType, double tankCapacity, double gasConsumption, GasType gasType, TechnicalMechanical review, Soat soat){

        super(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, review, soat);
        this.tankCapacity = tankCapacity;
        this.gasConsumption = gasConsumption;
        this.gasType = gasType;


    }

    public String getId(){

        return id;
    }

    public String informe(){

        return "Gas " + carType + "\n" +
               "Combustible type: Gas\n" + 
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
               "\n";
    }
    
}
