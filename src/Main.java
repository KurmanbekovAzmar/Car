import Models.Car;
import Models.CarType;
import Service.ServiceImp.CarImpl;
import Service.Servise;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servise servise = new CarImpl();
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(1, LocalDate.of(2000,3,2), CarType.CABRIOLET);
        Car car2 = new Car(2, LocalDate.of(2000,3,2), CarType.SEDAN);
        Car car3 = new Car( 3,LocalDate.of(2000,3,2), CarType.CROSSOVER);
        for(;true;){
            System.out.println("0 - Exit, \n1 - Create car, \n2 - Get car by id, \n3 - Get all cars, \n4 - update car, \n5 - Delete car");
            int scan = scanner.nextInt();
            if(scan == 1){
                for(;true;){
                    System.out.println("0-exit, 1-car1, 2-car2, 3-car3");
                    int scan2 = scanner.nextInt();
                    if(scan2==1){
                        System.out.println("Car name: ");
                        String carName=scanner.nextLine();
                        car.setName(carName);
                        System.out.println("Car model: ");
                        String carModel=scanner.nextLine();
                        car.setModel(carModel);
                        System.out.println("Car Price: ");
                        double price = scanner.nextDouble();
                        car.setPrice(price);
                        servise.CreateCar(car);
                    } else if (scan2 == 2) {
                        System.out.println("Car name: ");
                        String carName=scanner.nextLine();
                        car2.setName(carName);
                        System.out.println("Car model: ");
                        String carModel=scanner.nextLine();
                        car2.setModel(carModel);
                        System.out.println("Car Price: ");
                        double price = scanner.nextDouble();
                        car2.setPrice(price);
                        servise.CreateCar(car2);
                    } else if (scan2 == 3) {
                        System.out.println("Car name: ");
                        String carName=scanner.nextLine();
                        car3.setName(carName);
                        System.out.println("Car model: ");
                        String carModel=scanner.nextLine();
                        car3.setModel(carModel);
                        System.out.println("Car Price: ");
                        double price = scanner.nextDouble();
                        car3.setPrice(price);
                        servise.CreateCar(car3);
                    } else if (scan2==0) {
                        break;
                    }
                }
                } else if (scan==2) {
                System.out.println("Id:");
                long id = scanner.nextLong();
                servise.getCarById(id);
            } else if (scan==3) {
                System.out.println("All cars: ");
                servise.getAllCars();
            } else if (scan==4) {
                System.out.println("Update car: ");
                servise.updateCar(1,car2);
            } else if (scan == 5) {
                System.out.println("Delete car");
                System.out.println("1- first car, 2- second car, 3- third car");
                int dcar = scanner.nextInt();
                if(dcar==1){
                    servise.deleteCar(1);
            } else if (dcar==2) {
                    servise.deleteCar(2);
                } else if (dcar==3) {
                    servise.deleteCar(3);
                }
            }
        }




    }

}