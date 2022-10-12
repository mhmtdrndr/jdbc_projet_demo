package carRentalDemo.Business;

import carRentalDemo.Entities.Color;

public interface IColorManager {
    public void addColor(Color color) throws Exception;

    public Color getAll();
}
