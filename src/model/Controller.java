package model;
import java.util.ArrayList;

public class Controller 
{
    // Asociations
    private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public void addMotorcycle(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew,
        double oilCapacity, double oilConsume, String typeMotorcycle, boolean sold
    ) {
        MotorcycleTypes motorcycleType = null;
        Motorcycle motorcycle;

        switch (typeMotorcycle) {
            case "ESTANDAR":
                motorcycleType = MotorcycleTypes.ESTANDAR;
                break;
            case "DEPORTIVA":
                motorcycleType = MotorcycleTypes.DEPORTIVA;
                break;
            case "SCOOTER":
                motorcycleType = MotorcycleTypes.SCOOTER;
                break;
            case "CROSS":
                motorcycleType = MotorcycleTypes.CROSS;
                break;
        }

        motorcycle = new Motorcycle(
             basePrice, salePrice, mark, model,
             cylinderCapacity, mileage, isNew,
             oilCapacity, oilConsume, motorcycleType
        );

        vehicleList.add(motorcycle);
    }

    public String addVehicle(
        String vehicleType, String autoMobileType, double basePrice, double salePrice, 
        String mark, String model, double cylinderCapacity, double mileage, boolean isNew
        ) {
        String out = "";

            

            switch (vehicleType) {
                case "Gasoline Car":

                    break;
                case "Electric Car":
                    break;
                case "Hybrid Car":
                    break;
            }

        return out;
    }

    // 
    public String showVehicles() {
        String out = "";
        for (Vehicle vehicle : vehicleList) {
            out += vehicle.toString();
        }
        return out;
    }


}
