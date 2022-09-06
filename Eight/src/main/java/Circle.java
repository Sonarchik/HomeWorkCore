public class Circle extends Shape{
    private final String SOME_TEXT = "method printShape: I am Circle, my color is  ";
    private final String TEXT = "I am Circle, my color is  ";
    public Circle(String colorName) {
        super(colorName);
    }

    @Override
    public void printShape() {
        System.out.println(SOME_TEXT + getColorName());
    }

    @Override
    public String toString() {
        return TEXT + getColorName();
    }
}
