package carRentalDemo.Entities;

public class Brand {
    private String brandId;
    private String brandName;
    private int active;

    public Brand() {

    }

    public Brand(String brandName, int active) {
        this.brandName = brandName;
        this.active = active;
    }
    
    public Brand(String brandId, String brandName, int active) {
        this.brandName = brandName;
        this.active = active;
    }

    public String getBrandId() {
        return brandName.substring(0, 3).toUpperCase();
    }

    public void setBrandId(String brandId) {
        this.brandId = brandName.substring(0, 3);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    
    
}
