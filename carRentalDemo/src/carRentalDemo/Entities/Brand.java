package carRentalDemo.Entities;

public class Brand {
	private int id;
	private String brandName;
	private boolean active;
	
	public Brand() {
		
	}

	public Brand(int id, String brandName, boolean active) {
		this.id = id;
		this.brandName = brandName;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
