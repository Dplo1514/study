package designPattern.factory;

// 클라이언트 코드
public class Main {
    public static void main(String[] args) {
        // 팩토리를 사용하여 객체 생성
        Shape rectangle = ShapeFactory.createShape("RECTANGLE"); // 직사각형 객체 생성
        rectangle.draw(); // 직사각형 그리기

        Shape square = ShapeFactory.createShape("SQUARE"); // 정사각형 객체 생성
        square.draw(); // 정사각형 그리기
    }
}
