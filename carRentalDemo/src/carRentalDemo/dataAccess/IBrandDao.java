package carRentalDemo.dataAccess;

import java.util.List;

import carRentalDemo.Entities.Brand;

public interface IBrandDao<T> {
    void addBrand(Brand brand);
    List<T> getAll();
}
