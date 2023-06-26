package abstractfactory.factory;

import abstractfactory.product.KiaDoorProduct;
import abstractfactory.product.KiaTireProduct;
import abstractfactory.product.abstract_product.DoorProduct;
import abstractfactory.product.abstract_product.TireProduct;

public class KiaCarFactory extends CarFactory{
    @Override
    public TireProduct createTire() {
        return new KiaTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new KiaDoorProduct();
    }
}
