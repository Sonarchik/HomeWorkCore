public class Oval extends Shape{
    private final String SOME_TEXT = "method printShape: I am Oval, my color is  ";
    private final String TEXT = "I am Oval, my color is  ";
    public Oval(String colorName) {
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
