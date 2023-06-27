package proxy._02_after;

public class DefaultNoticeService implements NoticeService{

    @Override
    public void notice() {
        System.out.println("잠시 안내말씀이 있겠습니다.");
    }
}
