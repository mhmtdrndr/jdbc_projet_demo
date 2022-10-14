package carRentalDemo.Entities;

public class Car {
    private String plateNumber;
    private int brandId;
    private int colorId;
    private int modelYear;
    private double dailyPrice;
    private String description;

    public Car() {

    }

    public Car(String plateNumber, int brandId, int colorId, int modelYear, double dailyPrice,
            String description) {
        this.plateNumber = plateNumber;
        this.brandId = brandId;
        this.colorId = colorId;
        this.modelYear = modelYear;
        this.dailyPrice = dailyPrice;
        this.description = description;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Araç [PlakaNo=" + plateNumber + ", MarkaId=" + brandId + ", RenkId=" + colorId + ", Model Yılı="
                + modelYear + ", Günlük Kira Ücreti=" + dailyPrice + ", Açıklama=" + description + "]";
    }

}
