package abstractfactory;

import abstractfactory.factory.CarFactory;
import abstractfactory.factory.HyundaiCarFactory;
import abstractfactory.factory.KiaCarFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory hyundaiCarFactory = new HyundaiCarFactory();
        System.out.println(hyundaiCarFactory.createDoor().printDoor());
        System.out.println(hyundaiCarFactory.createTire().printTire());

        CarFactory kiaCarFactory = new KiaCarFactory();
        System.out.println(kiaCarFactory.createDoor().printDoor());
        System.out.println(kiaCarFactory.createTire().printTire());
    }
}
