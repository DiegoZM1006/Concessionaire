package model;

public class TechnicalMechanical extends Document{

    private double gasLevels;

    protected int [][] documentoTMR = new int [filas][columnas];

    public TechnicalMechanical(double price, int year, String image, double gasLevels){
        super(price, year, image);
        this.gasLevels = gasLevels;
    }
    

    /**
     * @return double return the gasLevels
     */
    public double getGasLevels() {
        return gasLevels;
    }

    /**
     * @param gasLevels the gasLevels to set
     */
    public void setGasLevels(double gasLevels) {
        this.gasLevels = gasLevels;
    }

    public String toString(){

        return "Price: " + price + "\n" +
               "Year: " + year + "\n" +
               "Code: " + image + "\n" +
               "Gas levels: " + gasLevels + "\n";
    }

}