package designPattern.proxy;

import java.util.ArrayList;

public class MyProgram {
    public static void main(String[] args) {
        ArrayList<ThumbNail> thumbNails = new ArrayList<ThumbNail>();

        thumbNails.add(new ProxyThumbNail("Git 강의1" , "url1"));
        thumbNails.add(new ProxyThumbNail("Git 강의2" , "url2"));
        thumbNails.add(new ProxyThumbNail("Git 강의3" , "url3"));
        thumbNails.add(new ProxyThumbNail("Git 강의4" , "url4"));
        thumbNails.add(new ProxyThumbNail("Git 강의5" , "url5"));

        for (ThumbNail thumbNail : thumbNails) {
            thumbNail.showTitle();
            System.out.println(thumbNail.getClass());
        }

        thumbNails.get(0).showPreview();
        System.out.println(thumbNails.get(0).getClass());
        thumbNails.get(1).showPreview();
        thumbNails.get(2).showPreview();
        thumbNails.get(3).showPreview();
        thumbNails.get(0).showPreview();
    }

}
