package factorymethod._01_before;

public class CarFactory {

    public static Car createCar(String size, String phoneNumber) {

        // validation
        if (size == null || size.isBlank()) {
            throw new IllegalArgumentException("차량 크기를 입력해주세요");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }

        Car car = new Car();
        if (size.equals("small")) {
            car.setSize("small");
            car.setWeight(1000);    // 1 ton
        } else if (size.equals("medium")) {
            car.setSize("medium");
            car.setWeight(5000);    // 5 ton
        } else {
            car.setSize("large");
            car.setWeight(10000);   // 10 ton
        }

        // notify
        System.out.println("전화번호 : " + phoneNumber + " | 문자 전송 완료");

        return car;
    }
}
