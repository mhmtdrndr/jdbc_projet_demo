package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Color;

public interface IColorManager {
    void addColor(Color color) throws Exception;
    List<Color> getAll();
}
