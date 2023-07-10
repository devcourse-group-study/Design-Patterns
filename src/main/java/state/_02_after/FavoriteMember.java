package state._02_after;

import state._01_before.Member;
import state._02_after.state.State;
import state._02_after.state.Used;

import java.util.ArrayList;
import java.util.List;

public class FavoriteMember {

    private State state;
    public FavoriteMember() {
        this.state = new Used(this);
    }


    private List<Member> members = new ArrayList<>();


    public void addFavoriteMembers(Member member) {
        state.addFavoriteMembers(member);
    }

    public List<Member> getMembers() {
        return members;
    }

    public void changeState(State state) {
        this.state = state;
    }
}
