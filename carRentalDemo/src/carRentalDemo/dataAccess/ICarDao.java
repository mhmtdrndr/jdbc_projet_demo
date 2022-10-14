package carRentalDemo.dataAccess;

import java.util.List;

import carRentalDemo.Entities.Car;

public interface ICarDao<T> {
    void addCar(Car car);
    List<Car> getAll();
}
