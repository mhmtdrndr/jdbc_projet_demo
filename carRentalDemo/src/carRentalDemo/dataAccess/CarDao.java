package carRentalDemo.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import carRentalDemo.Entities.Car;
import carRentalDemo.dbConn.DbHelper;

public class CarDao implements ICarDao<Car> {

    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public void addCar(Car car) {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String plateNumber = car.getPlateNumber();
            int brandId = car.getBrandId();
            int colorId = car.getColorId();
            int modelYear = car.getModelYear();
            double dailyPrice = car.getDailyPrice();
            String description = car.getDescription();
            String sqlString = "insert into Cars (PlateNumber, BrandId, ColorId, ModelYear, DailyPrice, Description ) "
                    + "values ('" + plateNumber + "','" + brandId + "','" + colorId + "','" + modelYear + "','"
                    + dailyPrice + "','" + description + "')";
            statement.executeUpdate(sqlString);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Cars");
            while (resultSet.next()) {
                Car car = new Car(resultSet.getString("PlateNumber"), resultSet.getInt("BrandId"),
                        resultSet.getInt("ColorId"), resultSet.getInt("ModelYear"), resultSet.getDouble("DailyPrice"),
                        resultSet.getString("Description"));
                cars.add(car);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return cars;
    }

}
