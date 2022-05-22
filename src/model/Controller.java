package model;

import java.util.ArrayList;
import java.util.zip.ZipEntry;

public class Controller {

    public static final int MAX_COLUMS = 5;
    public static final int MAX_ROWS = 10;

    public static final int ROWS = 4;
    public static final int COLUMS = 4;

    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    private Vehicle [][] parking = new Vehicle[MAX_ROWS][MAX_COLUMS];
    private String [][] map = new String[MAX_ROWS][MAX_COLUMS];


    private int [][] documentoSOAT = new int [ROWS][COLUMS];
    private int [][] documentoReview = new int [ROWS][COLUMS];
    private int [][] propertyCard = new int [ROWS][COLUMS];

    Motorcycle motorcycle;
    Gas gasCar;
    Electric electricCar;
    Hybrid hybridCar;

    public Controller() {
        map = fillMap();
    }

    private String[][] fillMap() {
        String[][] copyMap = new String[MAX_ROWS][MAX_COLUMS];
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j < MAX_COLUMS; j++) {
                copyMap[i][j] = "O";
            }
        }
        return copyMap;
    }

    private String printNumeric(int[][] documentoSOAT) {
		String print ="";
		for (int i=0; i< documentoSOAT.length; i++ ) { // ROWS numbers.length
			for (int j = 0; j < documentoSOAT[0].length; j++) { //COLUMS numbers[0].length
				print += documentoSOAT[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}

    public String generateSOAT(){

        String out ="";
        String outFinal = "";

		for(int i=0;i<ROWS;i++){
			for (int j=0;j<COLUMS;j++){
		        documentoSOAT[i][j] = (int)(Math.random()*(100-1+1)+1);
		    }
		}

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLUMS;j++){
                if(i==0 && j==0){
                    out += documentoSOAT[i][j];
                }
                if(i==1 && j==0){
                    out += documentoSOAT[i][j];
                }
                if(i==2 && j==0){
                    out += documentoSOAT[i][j];
                }
                if(i==3 && j==0){
                    out += documentoSOAT[i][j];
                }
                if(i==3 && j==1){
                    out += documentoSOAT[i][j];
                }
                if(i==3 && j==2){
                    out += documentoSOAT[i][j];
                }
                if(i==3 && j==3){
                    out += documentoSOAT[i][j];
                }
            }
        }

        outFinal = printNumeric(documentoSOAT);
        return outFinal + "\n" + "The code for the SOAT is: " + out;
    }

    public String generateReview(){

        String out ="";
        String outFinal = "";

        for(int i=0;i<ROWS;i++){
            for (int j=0;j<COLUMS;j++){
                documentoReview[i][j] = (int)(Math.random()*(100-1+1)+1);
            }
        }

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLUMS;j++){
              if(i==0 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==1){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==2){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==3){
                  out += documentoReview[i][j];
              }
              if(i==1 && j==2){
                  out += documentoReview[i][j];
              }
              if(i==2 && j==1){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==1){
                out += documentoReview[i][j];
              }
              if(i==3 && j==2){
                out += documentoReview[i][j];
              }
              if(i==3 && j==3){
                out += documentoReview[i][j];
              }
            }
        }

        outFinal = printNumeric(documentoReview);
        return outFinal + "\n" + "The code for the Technical Mechanical Review is: " + out;
    }

    public String generatePropertyCard(){

        String out ="";
        String outFinal = "";

		for(int i=0;i<ROWS;i++){
			for (int j=0;j<COLUMS;j++){
		        propertyCard[i][j] = (int)(Math.random()*(100-1+1)+1);
		    }
		  }

        for(int i=3;i>0;i--){
            for(int j=3;j>0;j--){
                if(i==3 && j==3){
                    out += propertyCard[i][j];
                }
                if(i==3 && j==1){
                    out += propertyCard[i][j];
                }
                if(i==2 && j==2){
                    out += propertyCard[i][j];
                }
                if(i==2 && j==0){
                    out += propertyCard[i][j];
                }
                if(i==1 && j==3){
                    out += propertyCard[i][j];
                }
                if(i==1 && j==1){
                    out += propertyCard[i][j];
                }
                if(i==0 && j==2){
                    out += propertyCard[i][j];
                }
            }
        }

        outFinal = printNumeric(propertyCard);
        return outFinal + "\n" + "The code for the Property Card is: " + out + "\n";

    }

    public String travelMatrixSOAT(){

        String out = "";

        generateSOAT();

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLUMS;j++){

              if(i==0 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==1 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==2 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==1){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==2){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==3){
                  out += documentoSOAT[i][j];
              }

            }
        }


       return out;
    }

   public String travelMatrixReview(){

      String out ="";

      generateReview();

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLUMS;j++){

              if(i==0 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==1 && out.length()==1){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==2 && out.length()==2){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==3 && out.length()==3){
                  out += documentoReview[i][j];
              }
              if(i==1 && j==2 && out.length()==4){
                  out += documentoReview[i][j];
              }
              if(i==2 && j==1 && out.length()==5){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==0 && out.length()==6){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==1 && out.length()==7){
                out += documentoReview[i][j];
              }
              if(i==3 && j==2 && out.length()==8){
                out += documentoReview[i][j];
              }
              if(i==3 && j==3 && out.length()==9){
                out += documentoReview[i][j];
              }

            }
        }

        return out;
    }

    public String travelMatrixCard(){

        String out = "";

        generatePropertyCard();

        for(int i=3;i>0;i--){
            for(int j=3;j>0;j--){

              if(i==3 && j==3){
                  out += propertyCard[i][j];
              }
              if(i==3 && j==1){
                  out += propertyCard[i][j];
              }
              if(i==2 && j==2){
                  out += propertyCard[i][j];
              }
              if(i==2 && j==0){
                  out += propertyCard[i][j];
              }
              if(i==1 && j==3){
                  out += propertyCard[i][j];
              }
              if(i==1 && j==1){
                  out += propertyCard[i][j];
              }
              if(i==0 && j==2){
                  out += propertyCard[i][j];
              }

            }
        }

        return out;
    }

    public String motorcycleRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean havePropertyCard, String propertyCard, double gasCapacity, double gasConsumption, int opTypeMotorcycle, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";


        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanical review = new TechnicalMechanical(price2, year2, travelMatrixReview(), gasLevels);

        MotorcycleType motorcycleType = null;

        switch(opTypeMotorcycle){

            case 1:
                motorcycleType = MotorcycleType.STANDAR;
                break;
            case 2:
                motorcycleType = MotorcycleType.SPORTIVE;
                break;
            case 3:
                motorcycleType = MotorcycleType.SCOOTER;
                break;  
            case 4:
                motorcycleType = MotorcycleType.CROSS;
        }

        Motorcycle motorcycle = new Motorcycle(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, havePropertyCard, propertyCard, gasCapacity, gasConsumption, motorcycleType, review, soat);
        vehicles.add(motorcycle);

        for(int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){
                if(modell<2015&&type.equalsIgnoreCase("USED")){
                    if(modell==2014&&j==0 && parking[i][j] == null){
                        parking[i][j] = motorcycle;
                        map[i][j] = "X";
                        i=10;
                        j=5;
                    } if (modell==2013&&j==1 && parking[i][j] == null) {
                        parking[i][j] = motorcycle;
                        map[i][j] = "X";
                        i=10;
                        j=5;
                    } if (modell==2012&&j==2 && parking[i][j] == null) {
                        parking[i][j] = motorcycle;
                        map[i][j] = "X";
                        i=10;
                        j=5;
                    } if (modell==2011&&j==3 && parking[i][j] == null) {
                        parking[i][j] = motorcycle;
                        map[i][j] = "X";
                        i=10;
                        j=5;
                    } if (modell<2011&&j==4 && parking[i][j] == null) {
                        parking[i][j] = motorcycle;
                        map[i][j] = "X";
                        i=10;
                        j=5;
                    }
                }
            }
        }
        out += "\nMOTORCYCLE SUCCESFULLY REGISTRATED\n" ;
        return out;
    }

    public String gasCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean havePropertyCard, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption, int opTypeCar, int opTypeGas,double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanical review = new TechnicalMechanical(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        GasType gasType = null;

        switch(opTypeCar){

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(opTypeGas){

            case 1:
                gasType = GasType.EXTRA;
                break;
            case 2:
                gasType = GasType.CORRIENTE;
                break;
            case 3:
                gasType = GasType.DIESEL;    
        }

        Gas gasCar = new Gas(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, carType, tankCapacity, gasConsumption, gasType, review, soat);
        vehicles.add(gasCar);

        for(int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==0 && parking[i][j] == null){

                        parking[i][j] = gasCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2013&&j==1 && parking[i][j] == null){

                        parking[i][j] = gasCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2012&&j==2 && parking[i][j] == null){

                        parking[i][j] = gasCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2011&&j==3 && parking[i][j] == null){

                        parking[i][j] = gasCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell<2011&&j==4 && parking[i][j] == null){

                        parking[i][j] = gasCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;

                    }

                }

            }
        }

        out += "\nGAS CAR SUCCESFULLY REGISTRATED\n";

        return out;
    }

    public String electricCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean havePropertyCard, String propertyCard, int numberOfDoors, boolean polarizedWindows, double batteryDuration, double batteryConsumption, int opTypeCar, int opTypeCharger, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanical review = new TechnicalMechanical(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        Charger charger = null;

        switch(opTypeCar){

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(opTypeCharger){

            case 1:
                charger = Charger.FAST;
                break;
            case 2:
                charger = Charger.NORMAL;
                break;
        }

        Electric electricCar = new Electric(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, carType, batteryDuration, batteryConsumption, charger, review, soat);
        vehicles.add(electricCar);

        for(int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==0 && parking[i][j] == null){

                        parking[i][j] = electricCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2013&&j==1 && parking[i][j] == null){

                        parking[i][j] = electricCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2012&&j==2 && parking[i][j] == null){

                        parking[i][j] = electricCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2011&&j==3 && parking[i][j] == null){

                        parking[i][j] = electricCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell<2011&&j==4 && parking[i][j] == null){

                        parking[i][j] = electricCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;

                    }

                }

            }
        }

        out += "\nELECTRIC CAR SUCCESFULLY REGISTRATED\n";

        return out;
    }

    public String hybridCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean havePropertyCard, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption, double batteryDuration, double batteryConsumption, int opTypeCar, int opTypeGas, int opTypeCharger, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanical review = new TechnicalMechanical(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        GasType gasType = null;
        Charger charger = null;

        switch(opTypeCar) {

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(opTypeGas) {

            case 1:
                gasType = GasType.EXTRA;
                break;
            case 2:
                gasType = GasType.CORRIENTE;
                break;
            case 3:
                gasType = GasType.DIESEL;    
        }

        switch(opTypeCharger) {

            case 1:
                charger = Charger.FAST;
                break;
            case 2:
                charger = Charger.NORMAL;
                break;
        }

        Hybrid hybridCar = new Hybrid(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, havePropertyCard, propertyCard, numberOfDoors, polarizedWindows, carType, tankCapacity, gasConsumption, batteryDuration, batteryConsumption, gasType, charger, review, soat);
        vehicles.add(hybridCar);

        for(int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==0 && parking[i][j] == null){

                        parking[i][j] = hybridCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2013&&j==1 && parking[i][j] == null){

                        parking[i][j] = hybridCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2012&&j==2 && parking[i][j] == null){

                        parking[i][j] = hybridCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell==2011&&j==3 && parking[i][j] == null){

                        parking[i][j] = hybridCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;


                    }if(modell<2011&&j==4 && parking[i][j] == null){

                        parking[i][j] = hybridCar;
                        map[i][j] = "X";
                        i=10;
                        j=5;

                    }

                }

            }
        }

        out += "\nHYBRID CAR SUCCESFULLY REGISTRATED\n";

        return out;
    }

    public String showVehicles(){

        String out = "\n*--- CHOOSE THE VEHICLE ---*\n";
        int b = 0;

        for(Vehicle v: vehicles){
            out += "\n(" + b + ") " + " ID: " + v.getId() + " BRAND: " + v.getBrand() + " MODEL:" + v.getModell() + " MILEAGE: " + v.getMileage() + " BASE PRICE: " + v.getBasePrice() + " etc...";
            b++;
        }

        return out + "\n";
    }

    public String calculateTotalSalePrice(int i){

        String out = "";

        out += vehicles.get(i).getSalePrice();

        return out;
    }

    public String showReport(){

        String out = "";
        int b=0;

        for(Vehicle v: vehicles){

            out += "(" + b + ") " + v.toString() + "\n" ;
            b++;
        }

        return out;

    }

    public String vehicleId(String id){

        String out = "There is no vehicle with that ID";

        for(Vehicle v: vehicles){

            if (v.getId().equalsIgnoreCase(id)) {

                out = "\nThe code for the property card is: " + v.getPropertyCard() + "\n";

                if(v.getSoatYear()>=2022){

                    out += "\nVALID SOAT: " + "\n" + 
                           v.getSoat() + "\n"; 
                }else{

                    out += "\nEXPIRED SOAT: " + "\n" + 
                         v.getSoat() + "\n";

                }

                if(v.getTechnicalReviewYear()>=2022){

                    out += "VALID TECHNICAL MECHANICAL REVIEW: " + "\n" + 
                            v.getTechnicalReview() + "\n";

                }else{

                    out += "EXIRED TECHNICAL MECHANICAL REVIEW: " + "\n" + 
                            v.getTechnicalReview() + "\n";

                }
            
            }

        }

        return out;
    }

    public String printMap(){

        String print ="";
		for (int i=0; i<MAX_ROWS; i++ ) { // ROWS numbers.length
			for (int j = 0; j <MAX_COLUMS; j++) { //COLUMS numbers[0].length
				print += map[i][j] + " ";
			}
			print += "\n";
		}
		return print;
    }

    public String vehicleList(){

        String out = "";

        for(Vehicle v: vehicles){
            if(v.getModell()==2014){
                out += "\n2014 VEHICLE: " + "\n" + 
                v.toString() + "\n"; 
            }
        }
        for(Vehicle v: vehicles){
            if(v.getModell()==2013){
                out += "\n2013 VEHICLE: " + "\n" + 
                v.toString() + "\n"; 
            }
        }
        for(Vehicle v: vehicles){
            if(v.getModell()==2012){
                out += "\n2012 VEHICLE: " + "\n" + 
                v.toString() + "\n"; 
            }
        }
        for(Vehicle v: vehicles){
            if(v.getModell()<2011){
                out += "\nLess than 2011 VEHICLE: " + "\n" + 
                v.toString() + "\n"; 
            }
        }
        return out;
    }

    public String oldestAndNewer(){
        String out = "";
        String outFinal = "";
        boolean f=true;

        for(int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){

                if(parking[i][j] != null){

                  if(parking[i][j].getModell() == 2014){
                    out = "NEWER VEHICLE IN PARKING LOT:" + "\n" + parking[i][j].toString();
                    f=false;
                  }else if(parking[i][j].getModell() == 2013 && f){
                    out = "NEWER VEHICLE IN PARKING LOT:" + "\n" + parking[i][j].toString();
                    f=false;
                  }else if(parking[i][j].getModell() == 2012 && f){
                    out = "NEWER VEHICLE IN PARKING LOT:" + "\n" + parking[i][j].toString();
                    f=false;
                  }else if(parking[i][j].getModell() <= 2011 && f){
                    out = "NEWER VEHICLE IN PARKING LOT:" + "\n" + parking[i][j].toString();
                  }
                  
                  if(parking[i][j].getModell()<= 2011){
                    outFinal = parking[i][j].toString() + "";
                  }else if(parking[i][j].getModell() == 2012){
                    outFinal = parking[i][j].toString() + "";
                  }else if(parking[i][j].getModell()== 2013){
                    outFinal = parking[i][j].toString() + "";
                  }else if(parking[i][j].getModell()== 2014){
                    outFinal = parking[i][j].toString() + "";
                  }
                }
            }
        }

        return out + "\n" + "OLDEST VEHICLE IN PARKING LOT: " + "\n" + outFinal;
    }

    public double parkingOcupation(){

        double cont =0;

        for (int i=0;i<MAX_ROWS;i++){
            for(int j=0;j<MAX_COLUMS;j++){

                if(parking[i][j] != null){

                    cont=cont +1;
                }
            }
        }

        return cont;
    }
    
}

