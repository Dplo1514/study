package designPattern.facade;

import java.util.Map;

public class FacadePattern {
    public static void main(String[] args) {
        double[] myGeoLoc = new GeoLocation().getGeoLoc();

        InternetConnection conn = new InternetConnection();

        conn.connect();

        String data = conn.getData("https://주소_API_URL" , myGeoLoc);
        conn.disconnect();

        Map<String, Object> address = new Json().parse(data);

        System.out.println(address.get("address"));

        // 위 모든 과정을 아래의 코드 한줄로 실행 가능하도록 객체화함..
        new MyLocFacade().printMyAddress();
    }
}
