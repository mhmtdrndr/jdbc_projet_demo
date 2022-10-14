package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Car;

public interface ICarManager {
    void addCar(Car car) throws Exception;
    List<Car> getAll();
}
