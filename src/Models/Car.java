package Models;

import Service.ServiceImp.CarImpl;

import java.time.LocalDate;

public class Car  {
    long id;
    String model;
    String name;
    double price;
    LocalDate ussuedDate;
    CarType carType;

    public Car() {
    }

    public Car(long id,LocalDate ussuedDate, CarType carType) {
        this.ussuedDate = ussuedDate;
        this.carType = carType;
        this.id=id;
    }

    public Car(long id, String model, String name, double price, LocalDate ussuedDate, CarType carType) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.price = price;
        this.ussuedDate = ussuedDate;
        this.carType = carType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getUssuedDate() {
        return ussuedDate;
    }

    public void setUssuedDate(LocalDate ussuedDate) {
        this.ussuedDate = ussuedDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }



    @Override
    public String toString() {
        return "\nCar" +
                "\nid=" + id +
                "\nmodel='" + model + '\'' +
                "\nname='" + name + '\'' +
                "\nprice=" + price +
                "\nussuedDate=" + ussuedDate +
                "\ncarType=" + carType;
    }
}
