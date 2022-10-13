package carRentalDemo;

import carRentalDemo.Business.BrandManager;
import carRentalDemo.Business.ColorManager;
import carRentalDemo.Entities.Brand;
import carRentalDemo.Entities.Color;
import carRentalDemo.dataAccess.BrandDao;
import carRentalDemo.dataAccess.ColorDao;

public class Main {

	public static void main(String[] args) throws Exception {
	    ColorManager colorManager = new ColorManager(new ColorDao());
	    colorManager.getAll();
	    
	    Brand brand = new Brand("Scoda", 1);
	    BrandManager brandManager = new BrandManager(new BrandDao());
	    brandManager.addBrand(brand);
	    brandManager.getAll();

	}

}
