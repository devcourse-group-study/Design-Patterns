package factorymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Car smallCar = CarFactory.createCar("small", "1234");
        System.out.println(smallCar);

        Car mediumCar = CarFactory.createCar("medium", "1234");
        System.out.println(mediumCar);
    }
}
