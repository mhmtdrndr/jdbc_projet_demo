package carRentalDemo.Entities;

public class Color {
    private String colorId;
	private String colorName;
	private int active;
	
	public Color() {
		
	}

    public Color(String colorId, String colorName, int active) {
        this.colorId = colorId;
        this.colorName = colorName;
        this.active = active;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
	
	

}
