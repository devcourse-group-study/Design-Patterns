package state._01_before;

import java.util.ArrayList;
import java.util.List;

public class FavoriteMember {
    public enum State {
        USED, BLOCKED
    }

    private State state;
    public FavoriteMember() {
        this.state = State.USED;
    }


    private List<Member> members = new ArrayList<>();


    /*
    특정 조건이 추가될 때 마다 코드의 변경이 발생하며, 로직 자체가 복잡하다.
     */
    public void addFavoriteMembers(Member member) {
        if (state == State.USED) {
            this.members.add(member);
        } else if (state == State.BLOCKED) {
            throw new UnsupportedOperationException("차단된 계정은 친구를 추가할 수 없습니다.");
        }
    }

    public List<Member> getMembers() {
        return members;
    }

    public void changeState(State state) {
        this.state = state;
    }
}
