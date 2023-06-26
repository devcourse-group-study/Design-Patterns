package abstractfactory.factory;

import abstractfactory.product.abstract_product.DoorProduct;
import abstractfactory.product.abstract_product.TireProduct;

public abstract class CarFactory {
    public abstract TireProduct createTire();
    public abstract DoorProduct createDoor();
}
