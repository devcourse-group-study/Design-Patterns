package abstractfactory.product;

import abstractfactory.product.abstract_product.DoorProduct;

public class HyundaiDoorProduct extends DoorProduct {
    @Override
    public String printDoor() {
        return "Hyundai Door Produced.";
    }
}
