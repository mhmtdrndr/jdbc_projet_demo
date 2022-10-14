package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Car;
import carRentalDemo.dataAccess.ICarDao;

public class CarManager implements ICarManager {
    
    private ICarDao<Car> iCarDao;
    
    public CarManager(ICarDao<Car> iCarDao) {
        this.iCarDao = iCarDao;
    }

    @Override
    public void addCar(Car car) throws Exception {
        for (Car cars : iCarDao.getAll()) {
            if(cars.getPlateNumber().equals(car.getPlateNumber())) {
                throw new Exception("Aynı plakada Araç mecvuttur  : " + car.getPlateNumber()); 
            }
        }
        iCarDao.addCar(car);
        System.out.println("Araç eklendi. Eklenen aracın plakası : " + car.getPlateNumber());
    }

    @Override
    public List<Car> getAll() {
        for (Car c : iCarDao.getAll()) {
            System.out.println(c.toString());
        }
        return null;
    }

}
