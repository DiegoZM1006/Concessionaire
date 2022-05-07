package model;

public abstract class Vehicle 
{
    // Attributes
    private double basePrice;
    private double salePrice;
    private String mark;
    private String model;
    private double cylinderCapacity;
    private double mileage;
    private boolean isNew;
    private int[][] propertyCard = new int[4][4];

    private Soat soat;
    private MechanicalTechnician mt;

    // Constructor
    public Vehicle(
        double basePrice, double salePrice, String mark, String model,
        double cylinderCapacity, double mileage, boolean isNew
    ) {
        this.basePrice = basePrice;
        this.salePrice = salePrice;
        this.mark = mark;
        this.model = model;
        this.cylinderCapacity = cylinderCapacity;
        this.mileage = mileage;
        this.isNew = isNew;
        this.propertyCard = randomImage();
        this.soat = new Soat(0,0, randomImage());
        this.mt = new MechanicalTechnician(0,0, randomImage());
    }

    public int[][] randomImage() {
        int[][] newMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                newMatrix[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return newMatrix;
    }

    // Getters and Setters

    /**
     * @return double return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return double return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return String return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return double return the cylinderCapacity
     */
    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return double return the mileage
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * @return boolean return the isNew
     */
    public boolean getIsNew() {
        return isNew;
    }

    /**
     * @param isNew the isNew to set
     */
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
        /**
     * @return boolean return the isNew
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * @return String return the propertyCard
     */
    public String getPropertyCard() {
        String fullPropetyCard = "";
        fullPropetyCard = this.propertyCard[3][3] + "";
        fullPropetyCard += this.propertyCard[3][1] + "";
        fullPropetyCard += this.propertyCard[2][2] + "";
        fullPropetyCard += this.propertyCard[2][0] + "";
        fullPropetyCard += this.propertyCard[1][3] + "";
        fullPropetyCard += this.propertyCard[1][1] + "";
        fullPropetyCard += this.propertyCard[0][2] + "";
        return fullPropetyCard;
    }

    /**
     * @param propertyCard the propertyCard to set
     */
    public void setPropertyCard(int[][] propertyCard) {
        this.propertyCard = propertyCard;
    }

    /**
     * @return Soat return the soat
     */
    public Soat getSoat() {
        return soat;
    }

    /**
     * @param soat the soat to set
     */
    public void setSoat(Soat soat) {
        this.soat = soat;
    }

    /**
     * @return MechanicalTechnician return the mt
     */
    public MechanicalTechnician getMt() {
        return mt;
    }

    /**
     * @param mt the mt to set
     */
    public void setMt(MechanicalTechnician mt) {
        this.mt = mt;
    }

    // toString
    /*
    double basePrice, double salePrice, String mark, String model,
    double cylinderCapacity, double mileage, boolean isNew
    */
    public String toString() {
        String outNew = "";
        if (getIsNew() == false) {
            outNew = "The vehicle is NOT NEW";
        } else {
            outNew = "The vehicle is NEW";
        }
        return "Base price: " + basePrice + "\n" +
                "Sale price: " + salePrice + "\n" +
                "Mark: " + mark + "\n" +
                "Model: " + model + "\n" +
                "Cylinder capacity: " + cylinderCapacity + "\n" +
                "Mileage: " + mileage + "\n" +
                "Property Card: " + getPropertyCard() + "\n" +
                outNew + "\n"
        ;
    }
}
