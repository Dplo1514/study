package designPattern.proxy;

interface ThumbNail {
    void showTitle();
    void showPreview();
}

// 실제 동작 ( 무거운 동작 )을 수행할 객체
class RealThumbNail implements ThumbNail{
    private String title;
    private String movieUrl;

    public RealThumbNail(String _title , String _movieUrl) {
        this.title = _title;
        this.movieUrl = _movieUrl;

        // URL로부터 영상을 다운로드하는 작업 시간 소요
        System.out.println(this.movieUrl + "로 부터" + this.title + "의 영상 데이터 다운로드");
    }

    @Override
    public void showTitle(){
        System.out.println("제목" + this.title);
    }
    @Override
    public void showPreview() {
        System.out.println(this.title + "의 프리뷰 재생");
    }
}

class ProxyThumbNail implements ThumbNail{
    private String title;
    private String movieUrl;

    private RealThumbNail realThumbNail;


    public ProxyThumbNail(String _title, String _movieUrl) {
        this.title = _title;
        this.movieUrl = _movieUrl;
    }

    //1. title을 보여주는 가벼운 작업은 ProxyThumbNail 객체 스스로 한다.
    @Override
    public void showTitle() {
        System.out.println("제목" + this.title);
    }

    public void showPreview(){
        //2. preview를 보여줘야하는 무거운 작업은 realThumbNail 객체를 생성해 진행한다.
        if (realThumbNail == null){
            realThumbNail = new RealThumbNail(title , movieUrl);
        }
        realThumbNail.showPreview();
    }
}
