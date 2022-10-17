package carRentalDemo.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import carRentalDemo.Entities.Brand;
import carRentalDemo.dbConn.DbHelper;

public class BrandDao implements IBrandDao<Brand>{
    
    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public void addBrand(Brand brand) {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String brandId = brand.getBrandId();
            String brandName = brand.getBrandName();
            int active = brand.getActive();
            String sqlString = "insert into Brands (BrandId, BrandName, Active) values ('" + brandId + "','" + brandName + "','" + active + "')";
            statement.executeUpdate(sqlString);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        
    }

    @Override
    public List<Brand> getAll() {
        List<Brand> brands = new ArrayList<>();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Brands");
            while(resultSet.next()) {
                Brand brand = new Brand(resultSet.getString("BrandId"), resultSet.getString("BrandName"), resultSet.getInt("Active"));
                brands.add(brand);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        
        return brands;
    }

}
