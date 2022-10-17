package carRentalDemo.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import carRentalDemo.Entities.Color;
import carRentalDemo.dbConn.DbHelper;

public class ColorDao implements IColorDao<Color> {

    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public void addColor(Color color) {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            String colorId = color.getColorId();
            String colorName = color.getColorName();
            int active = color.getActive();
            String sqlString = "insert into Colors (ColorId, ColorName, Active) values ('" + colorId + "','" + colorName + "','" + active + "')";
            statement.executeUpdate(sqlString);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    @Override
    public List<Color> getAll() {
        List<Color> colors = new ArrayList<>();
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from Colors");
            while(resultSet.next()) {
                Color color = new Color(resultSet.getString("ColorId") ,resultSet.getString("ColorName"),resultSet.getInt("Active"));
                colors.add(color);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return colors;
    }

}
