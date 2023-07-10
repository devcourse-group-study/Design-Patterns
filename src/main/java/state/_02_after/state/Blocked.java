package state._02_after.state;

import state._01_before.Member;
import state._02_after.FavoriteMember;

public class Blocked implements State{
    private FavoriteMember favoriteMember;

    public Blocked(FavoriteMember favoriteMember) {
        this.favoriteMember = favoriteMember;
    }

    @Override
    public void addFavoriteMembers(Member member) {
        throw new UnsupportedOperationException("차단된 계정은 친구를 추가할 수 없습니다.");
    }
}
