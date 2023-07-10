package state._01_before;

import static state._01_before.FavoriteMember.State.*;

public class Client {
    public static void main(String[] args) {
        FavoriteMember favoriteMember = new FavoriteMember();

        Member tommy = new Member("Tommy");
        Member kim = new Member("Kim");
        Member tom = new Member("TOM");

        favoriteMember.addFavoriteMembers(tommy);
        favoriteMember.addFavoriteMembers(kim);

        System.out.println(favoriteMember.getMembers());

        // BLOCKED
        favoriteMember.changeState(BLOCKED);
        favoriteMember.addFavoriteMembers(tom);


    }
}
