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
	    //Car car = new Car("02AAB245",1,1,2019,750,"Sedan");
	    CarManager carManager = new CarManager(new CarDao());
	    //carManager.addCar(car);
	    carManager.getAll();

	}

}
