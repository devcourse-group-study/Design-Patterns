package proxy._01_before;

public class Client {
    public static void main(String[] args) {
        NoticeService noticeService = new NoticeService();
        noticeService.notice();
    }
}
