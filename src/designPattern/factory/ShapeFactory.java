package designPattern.factory;

// 팩토리 클래스
class ShapeFactory {
    // 객체를 생성하는 정적 팩토리 메서드
    public static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
