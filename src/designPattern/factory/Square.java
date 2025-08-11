package designPattern.factory;

// 구체적인 구현 클래스 - 정사각형
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
