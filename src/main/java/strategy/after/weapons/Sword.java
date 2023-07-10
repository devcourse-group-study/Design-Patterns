package strategy.after.weapons;

public class Sword implements Weapon{
    @Override
    public void offensive() {
        System.out.println("칼을 휘두르다");
    }
}
