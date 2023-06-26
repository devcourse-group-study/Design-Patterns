package abstractfactory.product;

import abstractfactory.product.abstract_product.TireProduct;

public class KiaTireProduct extends TireProduct {
    @Override
    public String printTire() {
        return "Kia Tire Produced.";
    }
}
