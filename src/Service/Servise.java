package Service;

import Database.Database;
import Models.Car;

public interface Servise {

    String CreateCar(Car car);
    Car getCarById(Long id);
    Car[] getAllCars();
    String updateCar(long id, Car car);
    String deleteCar(long id);

}
