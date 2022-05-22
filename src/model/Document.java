package model;

public abstract class Document {

    public static final int filas = 4;
    public static final int columnas = 4;

    protected double price;
    protected int year;
    protected String image;

    public Document(double price, int year, String image){
        this.price = price;
        this.year = year;
        this.image = image;
    }
    
    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

}
