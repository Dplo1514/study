package designPattern.observer;

// 옵저버(Observer) 구현 클래스
class Display implements Observer {
    private float temperature;

    public void update(float temperature) {
        this.temperature = temperature;
        displayTemperature();
    }

    public void displayTemperature() {
        System.out.println("현재 온도: " + temperature + "도");
    }
}
