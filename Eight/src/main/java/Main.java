public class Main {
    public static void main(String[] args) {
        Shape figureOne = new Circle("green");
        Shape figureTwo = new Oval("black");
        Shape figureThree = new Quad("red");
        Shape figureFour = new Rectangle("yellow");
        Shape figureFive = new Triangle("blue");

        PrintName printName = new PrintName();
        printName.print(figureOne);
        printName.print(figureTwo);
        printName.print(figureThree);
        printName.print(figureFour);
        printName.print(figureFive);

    }
}
