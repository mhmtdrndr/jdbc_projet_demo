package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Brand;

public interface IBrandManager {
    void addBrand(Brand brand) throws Exception;
    List<Brand> getAll();
}
