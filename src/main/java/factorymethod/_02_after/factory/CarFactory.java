package factorymethod._02_after.factory;

import factorymethod._02_after.car.Car;

public interface CarFactory {

    default Car createCar(String phoneNumber) {
        validate(phoneNumber);
        Car car = makeCar();
        notify(phoneNumber);
        return car;
    }

    private static void validate(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }

    Car makeCar();

    private static void notify(String phoneNumber) {
        System.out.println("전화번호 : " + phoneNumber + " | 문자 전송 완료");
    }
}
