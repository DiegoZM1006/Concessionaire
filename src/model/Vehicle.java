package model;

public abstract class Vehicle {

    public static final int MAX_DOCUMENT = 2;

    protected String id;
    protected double basePrice;
    protected double salePrice;
    protected String brand;
    protected int modell;
    protected double displacement;
    protected double mileage;
    protected String type;
    protected String plaque;
    protected boolean havePropertyCard;
    protected String propertyCard;

    protected TechnicalMechanical review;
    protected Soat soat;


    private Document [] documents =  new Document [MAX_DOCUMENT];

    public Vehicle(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean havePropertyCard, String propertyCard, TechnicalMechanical review, Soat soat) {
        this.id = id;
        this.basePrice = basePrice;
        this.salePrice = salePrice;
        this.brand = brand;
        this.modell = modell;
        this.displacement = displacement;
        this.mileage = mileage;
        this.type = type;
        this.plaque = plaque;
        this.havePropertyCard = havePropertyCard;
        this.propertyCard = propertyCard;
        this.review = review;
        this.soat = soat;
    }

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return double return the displacement
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * @param displacement the displacement to set
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
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
     * @return String return the plaque
     */
    public String getPlaque() {
        return plaque;
    }

    /**
     * @param plaque the plaque to set
     */
    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    /**
     * @return boolean return the havePropertyCard
     */
    public boolean getHavePropertyCard() {
        return havePropertyCard;
    }

    /**
     * @param propertyCardd the havePropertyCard to set
     */
    public void setHavePropertyCard(boolean havePropertyCard) {
        this.havePropertyCard = havePropertyCard;
    }

    /**
     * @return String return the propertyCard
     */
    public String getPropertyCard() {
        return propertyCard;
    }

    /**
     * @param propertyCard the propertyCard to set
     */
    public void setPropertyCard(String propertyCard) {
        this.propertyCard = propertyCard;
    }


    /**
     * @return boolean return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * @return Document return the documents
     */
    public Document[] getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }

    /**
     * @return String return the modell
     */
    public int getModell() {
        return modell;
    }

    /**
     * @param documents the documents to set
     */
    public void setModell(int modell) {
        this.modell = modell;
    }

    public String informe(){

        String out = "";

        return out;
    }

    public int getSoatYear(){

        return soat.getYear();
    }

    public int getTechnicalReviewYear(){

        return review.getYear();
    }

    public String getSoat(){

        return soat.toString();
    }

    public String getTechnicalReview(){

        return review.toString();
    }
}
