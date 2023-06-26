package factorymethod._02_after.factory;

import factorymethod._02_after.car.Car;
import factorymethod._02_after.car.SmallCar;

public class SmallCarFactory implements CarFactory{

    @Override
    public Car makeCar() {
        return new SmallCar();
    }
}
