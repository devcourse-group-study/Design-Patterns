package factorymethod._02_after.factory;

import factorymethod._02_after.car.Car;
import factorymethod._02_after.car.LargeCar;

public class LargeCarFactory implements CarFactory{
    @Override
    public Car makeCar() {
        return new LargeCar();
    }
}
