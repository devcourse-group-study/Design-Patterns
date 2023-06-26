package factorymethod._02_after.factory;

import factorymethod._02_after.car.Car;
import factorymethod._02_after.car.MediumCar;

public class MediumCarFactory implements CarFactory{
    @Override
    public Car makeCar() {
        return new MediumCar();
    }
}
