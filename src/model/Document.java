package model;

public abstract class Document 
{
    // Attributes
    private double price;
    private int year;
    private int[][] image = new int[4][4];
    
    // Constructor
    public Document(double price, int year, int[][] image) {
        this.price = price;
        this.year = year;
        this.image = image;
    }

    // Getters and Setters

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
     * @return int[][] return the image
     */
    public int[][] getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(int[][] image) {
        this.image = image;
    }

    // toString
    public String toString() {
        return "toString Document";
    }
}
