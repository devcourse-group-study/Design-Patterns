package proxy._01_before;

public class NoticeService {
    /*
     프록시를 적용하지 않은 경우
     NoticeService Class 에서 notice 핵심 로직 전 후로 로직을 추가할 수 있다.
     */

    public void notice() {
        System.out.println("잠시 안내말씀이 있겠습니다.");
    }
}
