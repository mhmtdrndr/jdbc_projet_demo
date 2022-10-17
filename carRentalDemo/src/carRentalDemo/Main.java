package carRentalDemo;

import carRentalDemo.Business.BrandManager;
import carRentalDemo.Business.CarManager;
import carRentalDemo.Business.ColorManager;
import carRentalDemo.Entities.Brand;
import carRentalDemo.Entities.Car;
import carRentalDemo.Entities.Color;
import carRentalDemo.dataAccess.BrandDao;
import carRentalDemo.dataAccess.CarDao;
import carRentalDemo.dataAccess.ColorDao;

public class Main {

	public static void main(String[] args) throws Exception {
	    
	    Brand brand = new Brand("Mercedes", 1);

	    BrandManager brandManager = new BrandManager(new BrandDao());
	    brandManager.addBrand(brand);
	    brandManager.getAll();
	}

}
