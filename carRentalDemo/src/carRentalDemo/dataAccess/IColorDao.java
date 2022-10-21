package carRentalDemo.dataAccess;

import java.util.List;

import carRentalDemo.Entities.Color;

public interface IColorDao<T> {
	void addColor(Color color);
	void updateColor(Color color);
	List<T> getAll(); 
}
