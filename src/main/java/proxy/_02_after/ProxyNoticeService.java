package proxy._02_after;

public class ProxyNoticeService implements NoticeService {

    private NoticeService noticeService;

    /*
    기술 한 것 외적으로도 필요한 로직들을 추가하면 된다.
     */
    @Override
    public void notice() {
        long before = System.currentTimeMillis();
        // Lazy Initialization
        if (this.noticeService == null) {
            this.noticeService = new DefaultNoticeService();
        }
        this.noticeService.notice();
        System.out.println("Time of this Logic = " + (System.currentTimeMillis() - before));    // 시간 측정 로직 추가
    }
}
