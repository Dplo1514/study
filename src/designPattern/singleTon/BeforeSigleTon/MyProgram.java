package designPattern.singleTon.BeforeSigleTon;

public class MyProgram {
    public static void main(String[] args) {
        // FirstPage에서 setter를 사용해 settings의 필드 값을 재정의하여 사용
        new FirstPage().setAndPrintSettings();
        // SecondPage에서는 이미 정의된 settings를 사용 재정의하지 않음
        new SecondPage().printSettings();
    }
}
