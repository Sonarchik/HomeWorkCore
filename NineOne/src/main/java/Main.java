public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.display();
        list.add(3,"12");
        list.display();
        list.remove(5);
        list.display();
        list.remove(5);
        list.display();
        list.clear();
        list.display();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        list.display();
        System.out.println("Size = " + list.size() );
        System.out.println("Value for index =  " + list.get(9));

    }
}
