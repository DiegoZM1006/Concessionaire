package model;

public class Car extends Vehicle {

    protected int numberOfDoors;
    protected boolean polarizedWindows;
    CarType carType;

    public Car(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, CarType carType, TechnicalMechanical review, Soat soat){
        super(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, review, soat);
        this.numberOfDoors = numberOfDoors;
        this.polarizedWindows = polarizedWindows;
        this.carType = carType;
    }

    /**
     * @return int return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return boolean return the polarizedWindows
     */
    public boolean isPolarizedWindows() {
        return polarizedWindows;
    }

    /**
     * @param polarizedWindows the polarizedWindows to set
     */
    public void setPolarizedWindows(boolean polarizedWindows) {
        this.polarizedWindows = polarizedWindows;
    }

}
