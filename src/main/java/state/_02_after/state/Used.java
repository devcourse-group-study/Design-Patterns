package state._02_after.state;

import state._01_before.Member;
import state._02_after.FavoriteMember;

public class Used implements State{
    private FavoriteMember favoriteMember;

    public Used(FavoriteMember favoriteMember) {
        this.favoriteMember = favoriteMember;
    }

    @Override
    public void addFavoriteMembers(Member member) {
        this.favoriteMember.getMembers().add(member);
    }
}
