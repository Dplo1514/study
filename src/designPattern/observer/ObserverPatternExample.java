package designPattern.observer;

// 메인 클래스
public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display1 = new Display();
        Display display2 = new Display();

        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);

        weatherData.setTemperature(25.5f);
        // 출력 예시: "현재 온도: 25.5도"

        weatherData.setTemperature(30.0f);
        // 출력 예시: "현재 온도: 30.0도"

        weatherData.removeObserver(display1);

        weatherData.setTemperature(27.8f);
        // 출력 예시: "현재 온도: 27.8도" (display1은 알림을 받지 않음)
    }
}
