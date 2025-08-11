package designPattern.factory;

// 구체적인 구현 클래스 - 직사각형
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
