package carRentalDemo.Entities;

public class Brand {
    private String brandName;
    private int active;

    public Brand() {

    }

    public Brand(String brandName, int active) {
        this.brandName = brandName;
        this.active = active;
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
