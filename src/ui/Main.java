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
				"\n******* MENU ******* \n" +
				"(1) Crear un vehiculo \n" +
				"(0) Salir \n" +
				"==> "
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
		switch (op) {
			case -1:
				break;
			case 0:
				SOUT.println("\nBye :C");
				break;
			case 1:
				createVehicle();
				break;
			default:
				SOUT.println("\nOpcion no valida :C\n");
				break;
		}
	}

	public void createVehicle() {

		SOUT.println(
			"\n" +
			"************************\n" +
			"|*--CREATING VEHICLE--*|\n" +
			"************************"
			);

		double basePrice = 0, salePrice = 0, cylinderCapacity = 0;
		int opIsNew = 0, opSold = 0;
		boolean isNew, sold;

		SOUT.println("Please enter the next information");

		do {
			SOUT.print("Base price: ");
			basePrice = sc.nextDouble();
		} while(basePrice < 0);

		do {
			SOUT.print("Sale price: ");
			salePrice = sc.nextDouble();
		} while(salePrice < 0);
		
		SOUT.print("Mark: ");
		sc.nextLine();
		String mark = sc.nextLine();
		SOUT.print("Model: ");
		String model = sc.nextLine();
		
		do {
			SOUT.print("Cylinder capacity: ");
			cylinderCapacity = sc.nextDouble();
		} while(cylinderCapacity < 0);

		SOUT.print("Mileage: ");
		double mileage = sc.nextDouble();
		
		do { 
			SOUT.print("The vehicle is new?: \n" + "(1) Yes \n(2) No \n==> ");
			opIsNew = sc.nextInt();
		} while(opIsNew != 1 && opIsNew != 2);

		do {
			SOUT.print("The vehicle was sold?: \n" + "(1) Yes \n(2) No \n==> ");
			opSold = sc.nextInt();
		} while(opSold != 1 && opSold != 2);

		isNew = (opIsNew == 1) ? true : false;
		sold = (opSold == 1) ? true : false;

		chooseTypeVehicle(
			basePrice, salePrice, mark, model, 
			cylinderCapacity, mileage, isNew, sold
			);
	}

	public void chooseTypeVehicle(
		double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew, boolean sold
	) {
		SOUT.println(
			"\n" +
			"**********************************\n" +
			"|*--CHOOSE THE TYPE OF VEHICLE--*|\n" +
			"**********************************"
			);
		
		int opVehicle = 0;

		do {
			SOUT.print(
				"What type of vehicle do you want to choose?: \n" +
				"(1) Automobile \n" +
				"(2) Motorcycle \n" +
				"==> "
			);
			opVehicle = sc.nextInt();
		} while(opVehicle != 1 && opVehicle != 2);

		int opAutoMotoType = 0;

		switch (opVehicle) {
			case 1:
				String autoMobileType;

				do {
					SOUT.print("What is the type of your automobile: \n(1) SEDAN \n(2) CAMIONETA \n==> ");
					opAutoMotoType = sc.nextInt();
				} while(opAutoMotoType != 1 && opAutoMotoType != 2);

				autoMobileType = (opAutoMotoType == 1) ? "SEDAN" : "CAMIONETA";

				SOUT.println(
					"\n" +
					"*************************************\n" +
					"|*--CHOOSE THE TYPE OF AUTOMOBILE--*|\n" +
					"************************************"
				);

				String vehicleType;

				do {
					SOUT.print(
						"What type of automobile do you want to choose?: \n" +
						"(1) Gasoline car \n" +
						"(2) Electric car \n" +
						"(3) Hybrid car \n" +
						"==> "
					);
					opVehicle = sc.nextInt();
				} while (opVehicle != 1 && opVehicle != 2 && opVehicle != 3);

				switch (opVehicle) {
					case 1:
						vehicleType = "Gasoline Car";
						break;
					case 2:
						vehicleType = "Electric Car";
						break;
					case 3:
						vehicleType = "Hybrid Car";
						break;
				}

				// SOUT.println(system.addAutomobile(vehicleType, autoMobileType, basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew));

				break;
			case 2:
				String motorcycleType = "";
				int discount = 0;	

				salePrice = (sold == true) ? (salePrice * 0.04) + salePrice : salePrice - (salePrice * 0.02);

				do {
					SOUT.print("Write 0 if you do not want to add a discount otherwise write the discount percentage: ");
					discount = sc.nextInt();
				} while (discount < 0 || discount > 100);

				salePrice = (discount != 0) ? salePrice - (salePrice * (discount/100)) : salePrice;

				do {
					SOUT.print("What is the type of your motorcycle: \n(1) ESTANDAR \n(2) DEPORTIVA \n(3) SCOOTER \n(4) CROSS \n==> ");
					opAutoMotoType = sc.nextInt();
				} while(opAutoMotoType != 1 && opAutoMotoType != 2 && opAutoMotoType != 3 && opAutoMotoType != 4);
				
				switch (opAutoMotoType) {
					case 1:
						motorcycleType = "ESTANDAR";
						break;
					case 2:
						motorcycleType = "DEPORTIVA";
						break;
					case 3:
						motorcycleType = "SCOOTER";
						break;
					case 4:
						motorcycleType = "CROSS";
						break;
					default:
						SOUT.println("Opcion no valida");
						break;
				}

				SOUT.print("Oil capacity: ");
				double oilCapacity = sc.nextDouble();
				SOUT.print("Oil consume: ");
				double oilConsume = sc.nextDouble();

				system.addMotorcycle(basePrice, salePrice, mark, model, cylinderCapacity, mileage, isNew, oilCapacity, oilConsume, motorcycleType, sold);
				SOUT.println("\n" + system.showVehicles());

				break;
			default:
				SOUT.println("Opcion no valida");
				break;
		}
	}
} 