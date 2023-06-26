package factorymethod._02_after;

import factorymethod._02_after.car.Car;
import factorymethod._02_after.factory.LargeCarFactory;
import factorymethod._02_after.factory.MediumCarFactory;
import factorymethod._02_after.factory.SmallCarFactory;

public class Client {
    public static void main(String[] args) {
        Car smallCar = new SmallCarFactory().createCar("1234");
        System.out.println(smallCar);

        Car mediumCar = new MediumCarFactory().createCar("1234");
        System.out.println(mediumCar);

        Car largeCar = new LargeCarFactory().createCar("1234");
        System.out.println(largeCar);
    }
}
