package abstractfactory.product;

import abstractfactory.product.abstract_product.DoorProduct;

public class KiaDoorProduct extends DoorProduct {
    @Override
    public String printDoor() {
        return "Kia Door produced.";
    }
}
