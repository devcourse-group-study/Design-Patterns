package proxy._02_after;

public class Client {
    public static void main(String[] args) {
        NoticeService noticeService = new ProxyNoticeService();
        noticeService.notice();
    }
}
