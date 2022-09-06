public class Rectangle extends Shape{
    private final String SOME_TEXT = "method printShape: I am Rectangle, my color is  ";
    private final String TEXT = "I am Rectangle, my color is  ";
    public Rectangle(String colorName) {
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
