package Service.ServiceImp;

import Database.Database;
import Models.Car;
import Service.Servise;

public class CarImpl extends Car implements Servise {

    @Override
    public String CreateCar(Car car) {
        Car[] newCars = new Car[Database.car.length+1];
        for(int i = 0;i<Database.car.length;i++){
            newCars[i] = Database.car[i];
        }
        newCars[Database.car.length] = car;
        Database.car = newCars;
        return "Succes";

    }

    @Override
    public Car getCarById(Long id) {
        Car car = null;
        for(int i = 0;i<Database.car.length;i++){
            if(Database.car[i].getId()==id){
                car = Database.car[i];
                System.out.println(car);
            }
        }
        return car;
    }

    @Override
    public Car[] getAllCars() {
        for (Car car:Database.car){
            System.out.println("______________________________");
            System.out.println(car);
        }
        return null;
    }

    @Override
    public String updateCar(long id, Car car) {
        for(int i = 0;i<Database.car.length;i++){
            if(Database.car[i].getId() == id){
                Database.car[i] = car;
            }
        }
        return "Success";
    }

    @Override
    public String deleteCar(long id) {
        int deleteIndex = 0;

        for (int i = 0; i < Database.car.length; i++) {
            if (Database.car[i].getId() == id) {
                deleteIndex = i;
            }
        }
        Car[] arr1 = new Car[deleteIndex];

        if (arr1.length > 0) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = Database.car[i];
            }
        }

        int arr2Length = Database.car.length - deleteIndex - 1;
        int continueIndex = deleteIndex + 1;

        Car[] arr2 = new Car[arr2Length];

        if (arr2.length > 0) {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = Database.car[continueIndex];
                continueIndex++;
            }
        }

        Car[] cars = new Car[Database.car.length - 1];

        int indexContinue = arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            cars[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            cars[indexContinue] = arr2[i];
            indexContinue++;
        }

        Database.car = cars;

        return "Deletet";
    }

}

