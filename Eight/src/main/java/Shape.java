abstract public class Shape implements Printable{
    private String colorName;

    public String getColorName() {
        return colorName;
    }

    public Shape (String colorName){
        this.colorName = colorName;
    }
    public Shape(){
    }
    public abstract void printShape();

}
