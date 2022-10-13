package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Color;
import carRentalDemo.dataAccess.IColorDao;

public class ColorManager implements IColorManager {

    private IColorDao<Color> iColorDao;

    public ColorManager(IColorDao<Color> iColorDao) {
        this.iColorDao = iColorDao;
    }

    @Override
    public void addColor(Color color) throws Exception {
        for (Color colors : iColorDao.getAll()) {
            if (colors.getColorName().equals(color.getColorName())) {
                throw new Exception("Girilen renk ismi veritabanında mecvuttur!!! :" + color.getColorName());
            }
        }
        iColorDao.addColor(color);
        System.out.println("Renk eklendi :" + color.getColorName());
    }

    @Override
    public List<Color> getAll() {
        for (Color c : iColorDao.getAll()) {
            System.out.println("Renk Adı : " + c.getColorName() + " Aktif Mi? :" + c.getActive());
        }
        return null;
    }

}
