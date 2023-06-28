package facade.hometheater;

public class FacadeExample {
    public static void main(String[] args) {
        Client client = new Client(HomeTheaterMaker.makeFacade());
    }
}
