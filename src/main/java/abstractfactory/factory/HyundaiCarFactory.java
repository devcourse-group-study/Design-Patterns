package abstractfactory.factory;

import abstractfactory.product.HyundaiDoorProduct;
import abstractfactory.product.HyundaiTireProduct;
import abstractfactory.product.abstract_product.DoorProduct;
import abstractfactory.product.abstract_product.TireProduct;

public class HyundaiCarFactory extends CarFactory{
    @Override
    public TireProduct createTire() {
        return new HyundaiTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new HyundaiDoorProduct();
    }
}
