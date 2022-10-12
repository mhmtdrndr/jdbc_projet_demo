package carRentalDemo;

import carRentalDemo.Business.ColorManager;
import carRentalDemo.Entities.Color;
import carRentalDemo.dataAccess.ColorDao;

public class Main {

	public static void main(String[] args) throws Exception {
		Color color = new Color("Mavi", 1);
		ColorManager colorManager = new ColorManager(new ColorDao());

		colorManager.addColor(color);
		
		colorManager.getAll();

	}

}
