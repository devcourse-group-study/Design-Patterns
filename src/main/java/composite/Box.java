package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        this.components.add(component);
    }
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
