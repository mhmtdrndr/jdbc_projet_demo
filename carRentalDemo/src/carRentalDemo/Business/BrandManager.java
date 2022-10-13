package carRentalDemo.Business;

import java.util.List;

import carRentalDemo.Entities.Brand;
import carRentalDemo.dataAccess.IBrandDao;

public class BrandManager implements IBrandManager {
    
    private IBrandDao<Brand> iBrandDao;
    
    public BrandManager(IBrandDao<Brand> iBrandDao) {
        this.iBrandDao = iBrandDao;
    }

    @Override
    public void addBrand(Brand brand) throws Exception {
       for(Brand brands : iBrandDao.getAll()) {
           if(brands.getBrandName().equals(brand.getBrandName())) {
               throw new Exception("Marka ismi database'de mevcuttur : " + brand.getBrandName());
           }
       }
       iBrandDao.addBrand(brand);
       System.out.println("Marka Eklendi : " +brand.getBrandName());
    }

    @Override
    public List<Brand> getAll() {
        for(Brand b : iBrandDao.getAll()) {
            System.out.println("Marka Adı : " + b.getBrandName() + " Aktif Mi? :" + b.getActive());
        }
        return null;
    }

}
