public class Quad extends Shape{
    private final String SOME_TEXT = "method printShape: I am Quad, my color is  ";
    private final String TEXT = "I am Quad, my color is  ";
    public Quad(String colorName) {
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
