package factorymethod._01_before;

public class Car {
    private String size;
    private int weight;

    public Car() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
