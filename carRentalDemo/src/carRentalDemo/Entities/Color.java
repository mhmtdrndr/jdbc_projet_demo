package carRentalDemo.Entities;

public class Color {
	private String colorName;
	private int active;
	
	public Color() {
		
	}

	public Color(String colorName, int active) {
		//this.id = id;
		this.colorName = colorName;
		this.active = active;
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
