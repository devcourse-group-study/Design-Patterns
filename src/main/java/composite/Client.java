package composite;

public class Client {
    public static void main(String[] args) {
        Product toy = new Product("toy", 50000);
        Product cupHolder = new Product("cupholder", 10000);

        Box box = new Box();
        box.add(toy);
        box.add(cupHolder);

        System.out.println(box.getPrice());
    }
}
