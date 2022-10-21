package carRentalDemo.dataAccess;

import java.util.List;

import carRentalDemo.Entities.Brand;

public interface IBrandDao<T> {
    void addBrand(Brand brand) throws Exception;
    List<T> getAll() throws Exception;
    void getByBrandId(String id) throws Exception;
}
