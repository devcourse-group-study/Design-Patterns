package state._02_after;

import state._01_before.Member;
import state._02_after.state.Blocked;

public class Client {

    public static void main(String[] args) {
        state._01_before.Member tommy = new state._01_before.Member("Tommy");
        state._01_before.Member kim = new state._01_before.Member("Kim");
        state._01_before.Member tom = new Member("TOM");

        FavoriteMember favoriteMember = new FavoriteMember();
        favoriteMember.addFavoriteMembers(tommy);

        favoriteMember.changeState(new Blocked(favoriteMember));
        favoriteMember.addFavoriteMembers(kim);
    }
}
