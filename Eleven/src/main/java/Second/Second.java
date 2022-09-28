package Second;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Bogdan");
        listOfNames.add("Ivan");
        listOfNames.add("Nikola");
        listOfNames.add("Peter");
        listOfNames.add("Oleg");
        listOfNames.add("Dasha");
        listOfNames.add("Sasha");
        listOfNames.add("Nina");
        listOfNames.add("Katia");
        listOfNames.add("Sergei");
        var second = Sorted.sorted(listOfNames);
        System.out.println(second);
    }
}
