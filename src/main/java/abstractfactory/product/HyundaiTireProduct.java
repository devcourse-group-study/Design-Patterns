package abstractfactory.product;

import abstractfactory.product.abstract_product.TireProduct;

public class HyundaiTireProduct extends TireProduct {
    @Override
    public String printTire() {
        return "Hyundai Tire Produced.";
    }
}
