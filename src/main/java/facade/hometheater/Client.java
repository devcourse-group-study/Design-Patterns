package facade.hometheater;

public class Client {
    private HomeTheaterFacade theater;

    public Client(HomeTheaterFacade homeTheaterFacade) {
        this.theater = homeTheaterFacade;

        theater.watchMovie("Raiders of the Lost Ark");
        System.out.println("======================");
        theater.endMovie();
    }
}
