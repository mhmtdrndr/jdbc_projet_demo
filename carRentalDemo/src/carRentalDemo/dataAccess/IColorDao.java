package carRentalDemo.dataAccess;

import java.util.List;

import carRentalDemo.Entities.Color;

public interface IColorDao {
	void addColor(Color color);
	List<Color> getAll(); 
}
