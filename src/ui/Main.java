package ui;
import java.util.Scanner;
import model.Controller;
import java.io.PrintStream;
import java.util.InputMismatchException;

/**
*	javac --release 8 -cp src src/ui/Main.java -d bin
*	java -cp bin ui.Main
**/

public class Main 
{
	private static final PrintStream SOUT = System.out;
	public Scanner sc;
	public static int op;
	public Controller system;

	public Main() {
		sc = new Scanner(System.in);
	}

	public void setSystem() {
		system = new Controller();
	}

	public static void main(String[] args) {
		// SOUT.println("\n*-- INICIANDO LA APLICACION --*\n");

		Main myMain = new Main();
		myMain.setSystem();

		do {
			op = myMain.showMenu();
			myMain.executeOperation(op);
		} while (op != 0);
	}

	public int showMenu() {
		try {
			SOUT.print(
				"\n*-------- MENU --------*\n" +
				"(1) Register vehicle \n" +
				"(2) Calculate total selling price \n"+
				"(3) Generate reports with all vehicle data\n"+
				"(4) Show document status\n" + 
                "(5) Generate system map\n" + 
                "(6) Generate system lot occupancy reports\n" +  
				"(0) To leave the application --> "
				);
			op = sc.nextInt();
		} catch (InputMismatchException e) {
			SOUT.println("\nIngresa un numero");
			op = -1;
			sc.next();
		}
		return op;
	}

	public void executeOperation(int op) {
		switch(op) {
			case 0:
				SOUT.println("Bye!");
				break;
			case 1:
				registerVehicle();
				break;
			case 2:
				showSalePrice();
				break;
			case 3:
				generateReport();
				break;
			case 4:
				searchVehicleById();
				break;
			case 5:
				printMap();
				break;
			case 6:
				systemReports();
				break;      
			default:
				SOUT.println("Error, wrong option");
			
			}
	}

	public void registerVehicle() {

		String id, brand, type = "", plaque, propertyCard;

		int op = 0, modell, opType = 0, opWasSold, opTypeMotorcycle = 0, opTypeCharger = 0, numberOfDoors = 0, polarized, opTypeGas = 0, opTypeCar = 0, year, year2;

		double basePrice, salePrice, displacement = 0, milleage = 0, gasCapacity, gasConsumption = 0, tankCapacity = 0, batteryDuration = 0, batteryConsumption = 0, price, amountCoverage, gasLevels, price2;

		boolean havePropertyCard = false, polarizedWindows = false;

		SOUT.println(
			"\n" +
			"************************\n" +
			"|*--CREATING VEHICLE--*|\n" +
			"************************\n"
			);

		SOUT.println("!! PLEASE ENTER THE NEXT INFORMATION !!\n");

		SOUT.print("Enter the id of the vehicle: ");
		id = sc.next();

		SOUT.print("Enter the base price of the vehicle: ");
		basePrice = sc.nextDouble();
		sc.nextLine();

		SOUT.print("Enter the brand of the vehicle: ");
		brand = sc.nextLine();

		SOUT.print("Enter the model of the vehicle: ");
		modell = sc.nextInt();

		SOUT.print("Enter the displacement of the vehicle: ");
		displacement = sc.nextInt();
		sc.nextLine();

		SOUT.print("Enter the milleage of the vehicle: ");
		milleage = sc.nextDouble();

		do {
			SOUT.print("PLEASE PICK A OPTION\n Your vehicle is?: \n (1) USED \n (2) NEW: ");
			opType = sc.nextInt();
		} while (opType != 1 && opType != 2);

		switch (opType) {
			case 1:
				type = "USED";
				break;
			case 2:
				type = "NEW";
				break;
		}

		if (type.equalsIgnoreCase("NEW")) {
			plaque = "NOT ASSIGNED";
		} else {
			SOUT.print("Enter the plaque of the vehicle: ");
			plaque = sc.next();
		}

		do {
			SOUT.print("Does the vehicle have been sold?\n (1) YES \n (2) NO: ");
			opWasSold = sc.nextInt();
		} while(opWasSold != 1 && opWasSold != 2);

		switch (opWasSold) {
			case 1:
				havePropertyCard = true;
				break;
			case 2:
				havePropertyCard = false;
				break;
		}

		if (havePropertyCard) {
			propertyCard = system.travelMatrixCard();
		} else {
			propertyCard = "NOT SOLD";
		}

		SOUT.print("Enter the price of the SOAT document: ");
		price = sc.nextDouble();

		SOUT.print("Enter the year of the SOAT document: ");
		year = sc.nextInt();
		sc.nextLine();

		SOUT.print("Enter the amount of coverage of the SOAT document: ");
		amountCoverage = sc.nextDouble();

		SOUT.print("Enter the price of the Tecnichal Mechanical Review document: ");
		price2 = sc.nextDouble();

		SOUT.print("Enter the year of the Tecnichal Mechanical Review document: ");
		year2 = sc.nextInt();
		sc.nextLine();

		SOUT.print("Enter the gas levels of the vehicle for the Tecnichal Mechanical Review document: ");
		gasLevels = sc.nextDouble();

		SOUT.print(
			"\n" +
			"**********************************\n" +
			"|*--CHOOSE THE TYPE OF VEHICLE--*|\n" +
			"**********************************\n"
			);

		do {
			SOUT.print(
				"TYPE OF VEHICLE\n"+
				"(1) Motrocycle\n" +
				"(2) Gas Car\n" +
				"(3) Electric Car\n" + 
				"(4) Hybrid Car --> "
				);
			op = sc.nextInt();
		} while(op != 1 && op != 2 && op != 3 && op != 4);

		if (op != 1) {

			SOUT.print("Enter the type of the Car\n" +
				"(1) SEDAN\n" +
            	"(2) CAMIONETA\n");
            opTypeCar = sc.nextInt();
            sc.nextLine();

			SOUT.print("Enter the number of the doors: ");
			numberOfDoors = sc.nextInt();

			do {
				SOUT.print("The windows are polarized\n (1) YES \n (2) NO --> ");
				polarized = sc.nextInt();
			} while(polarized != 1 && polarized != 2);

			switch (polarized) {
				case 1:
					polarizedWindows = true;
					break;
				case 2:
					polarizedWindows = false;
					break;
			}

			if (op == 2 || op == 4) {

				SOUT.print("Enter the type of gas of the Car\n" +
					"(1) EXTRA\n"+
					"(2) CORRIENTE\n"+ 
					"(3) DIESEL --> "
					);
				opTypeGas = sc.nextInt();
				sc.nextLine();

				SOUT.print("Enter the tank capacity of the Car: ");
                tankCapacity = sc.nextDouble();

				gasConsumption = tankCapacity*(displacement*150);

                SOUT.print("The gas consumption of the Car is: " + gasConsumption);

			} 
			if (op == 3 || op == 4) {

				do {
					SOUT.print("Enter the type of charger:\n" + 
						"(1) FAST\n" + 
						"(2) NORMAL --> "
						);
					opTypeCharger = sc.nextInt();
					sc.nextLine();
				} while (opTypeCharger != 1 && opTypeCharger != 2);

				SOUT.print("Enter the battery duration of the Car: ");
                batteryDuration = sc.nextDouble();

				if (opTypeCharger==1) {
                    batteryConsumption = (batteryDuration+13)*(displacement*100);
                } else {
                    batteryConsumption = (batteryDuration+18)*(displacement*100);
                }

				SOUT.println("The battery consumption of the Car is: " + batteryConsumption);

			}

		}

		switch (op) {
			case 1:

				if ( year<2022 || year2<2022 ){
					salePrice = 500000;
				} else {
					salePrice = 0;
				}
		
				salePrice = salePrice + (basePrice*0.04);
		
				if (type.equalsIgnoreCase("USED")){
					salePrice = salePrice - (basePrice*0.02);
				}
				
				SOUT.print("Enter the gas capacity of the motorcycle: ");
				gasCapacity = sc.nextDouble();
				
				gasConsumption = gasCapacity * (displacement * 75);

				SOUT.println("\nThe gas consumption of the vehicle is: " + gasConsumption + "\n");

				do {
					SOUT.print("Enter the type of the motorcycle\n" +
						"(1) STANDAR\n" +
						"(2) SPORTIVE\n" +
						"(3) SCOOTER\n" +
						"(4) CROSS --> " 
					);
					opTypeMotorcycle = sc.nextInt();
				} while(opTypeMotorcycle != 1 && opTypeMotorcycle != 2 && opTypeMotorcycle != 3 && opTypeMotorcycle != 4);

				SOUT.print(system.motorcycleRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, havePropertyCard, propertyCard, gasCapacity, gasConsumption, opTypeMotorcycle, price, year, amountCoverage, price2, year2, gasLevels));

				break;
			case 2:

				if(year<2022 || year2<2022){
					salePrice = 500000;
				} else {
					salePrice = 0;
				}

				if (type.equalsIgnoreCase("USED")) {
					salePrice = salePrice - (basePrice*0.1);
				}

				system.gasCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, tankCapacity, gasConsumption, opTypeCar, opTypeGas, price, year, amountCoverage, price2, year2, gasLevels);

				break;
			case 3:

				if (year<2022 || year2<2022) {
					salePrice = 500000;
				} else {
					salePrice = 0;
				}

				salePrice = salePrice + (basePrice*0.2);

				if (type.equalsIgnoreCase("USED")) {
					salePrice = salePrice - (basePrice*0.1);
				}

				system.electricCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, batteryDuration, batteryConsumption, opTypeCar, opTypeCharger, price, year, amountCoverage, price2, year2, gasLevels);

				break;
			case 4:

				if (year<2022 || year2<2022) {
					salePrice = 500000;
				} else {
					salePrice = 0;
				}

				salePrice = salePrice + (basePrice*0.15);

				if (type.equalsIgnoreCase("USED")) {
					salePrice = salePrice - (basePrice*0.1);
				}

				system.hybridCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, tankCapacity, gasConsumption, batteryDuration, batteryConsumption, opTypeCar, opTypeGas, opTypeCharger, price, year, amountCoverage, price2, year2, gasLevels);

				break;

		}
	}

	public String showSalePrice(){

        String out = "";
        int carToSearch;

		SOUT.println(system.showVehicles());
        SOUT.print("Choose the vehicle you want to calculate the total sale price: ");
        carToSearch = sc.nextInt();

        SOUT.println("The sale price is: " + system.calculateTotalSalePrice(carToSearch) + "\n");

        return out;
    }

    public String generateReport(){

        String out = "";

        SOUT.println("\n*--- ALL INFORMATION ---*\n");
		SOUT.println(system.showReport());
   
        return out;
    }

    public String searchVehicleById(){

        String out = "";
        String id = "";

        SOUT.print("\nEnter the id of the vehicle you want to search: ");
        id = sc.next();

        SOUT.println(system.vehicleId(id));

        return out;
    }

    public String printMap(){

        String out = "";

		SOUT.println("*--- MAP ---*");
        SOUT.println(system.printMap());

        return out;
    }

    public String systemReports(){

        String out = "";
        int op;
        boolean flag = true;

        do{
            SOUT.print("Pick an option: " + "\n"+
                           "(1) List of vehicles and their information in a range of years\n" +
                           "(2) Data of the oldest and newest vehicle\n"+
                           "(3) Parking lot occupancy rate --> ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch(op){

               case 1:
                   SOUT.println(system.vehicleList());
                   flag =false;
                   break;
                case 2: 
                    SOUT.println(system.oldestAndNewer());
                    flag =false;
                    break;
                case 3:
                    double percentage;
                    percentage = (system.parkingOcupation()/50*100);
                    SOUT.println("The ocupation percentage of the system lot is: " + percentage + "%");
                    flag =false;
                   break;  
                default:
                   SOUT.println("Wrong option");      
            }
        } while(flag);

        return out;
    }

} 