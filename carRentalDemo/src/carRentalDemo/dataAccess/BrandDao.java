package carRentalDemo.dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import carRentalDemo.Entities.Brand;
import carRentalDemo.dbConn.DbHelper;

public class BrandDao implements IBrandDao<Brand> {

    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public void addBrand(Brand brand) throws Exception {
        try {
            connection = dbHelper.getConnection();
            String brandId = brand.getBrandId();
            String brandName = brand.getBrandName();
            int active = brand.getActive();
            preparedStatement = connection.prepareStatement("insert into Brands (BrandId, BrandName, Active) values ('"
                    + brandId + "','" + brandName + "','" + active + "')");
            preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            dbHelper.showErrorMessage(sqlException);
        } finally {
            preparedStatement.close();
            dbHelper.getConnection().close();
        }

    }

    @Override
    public List<Brand> getAll() throws Exception {
        List<Brand> brands = new ArrayList<>();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Brands");
            while (resultSet.next()) {
                Brand brand = new Brand(resultSet.getString("BrandId"), resultSet.getString("BrandName"),
                        resultSet.getInt("Active"));
                brands.add(brand);
            }
        } catch (SQLException sqlException) {
            dbHelper.showErrorMessage(sqlException);
        } finally {
            statement.close();
            connection.close();
        }

        return brands;
    }

    @Override
    public void getByBrandId(String id) throws Exception {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Brands where BrandId = '" + id.toUpperCase() + "'");
            if (resultSet.next()) {
                String brandId = resultSet.getString("BrandId");
                String brandName = resultSet.getString("BrandName");
                int active = resultSet.getInt("Active");
                System.out.println(brandId + brandName + active);
            } else {
                System.out.println("Kayıt yok...");
            }
        } catch (SQLException sqlException) {
            dbHelper.showErrorMessage(sqlException);
        }
    }

}
