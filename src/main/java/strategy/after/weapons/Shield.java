package strategy.after.weapons;

public class Shield implements Weapon{
    @Override
    public void offensive() {
        System.out.println("방패로 밀친다");
    }
}
