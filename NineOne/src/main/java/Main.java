import java.util.Iterator;

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
        list.add(3, "12");
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
        System.out.println("Size = " + list.size());
        System.out.println("Value for index =  " + list.get(9));

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("next0");
        linkedList.add("next1");
        linkedList.add("next2");
        linkedList.add("next3");
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("linkedList.get() = " + linkedList.get(0));

        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        linkedList.remove(0);

        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println("");


        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.clear();
        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("next2");
        linkedList.add("next3");
        for (String s : linkedList) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("linkedList.size() = " + linkedList.size());
    }
}
