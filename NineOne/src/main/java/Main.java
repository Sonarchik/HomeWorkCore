import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        ***************** Test MyArrayList**********************************
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


//        ***************** Test MyLinkedList******************************

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

//        **************************** Test MyQueue ***********

        MyQueue <String> queue = new MyQueue<>();
        queue.add("que0");
        queue.add("que1");
        queue.add("que2");
        queue.add("que3");
        queue.add("que4");
        queue.add("que5");
        queue.add("que6");
        queue.add("que7");
        for (String s : queue) {
            System.out.print(s + " ");
        }

        System.out.println("");
        System.out.println("queue.peek() = " + queue.peek());
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("queue.remove() = " + queue.remove());
        queue.remove();
        System.out.println("queue.poll() = " + queue.poll());
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println("");
        queue.clear();

        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("queue.size() = " + queue.size());

//        ******************* TestMyStack*****************8
        MyStack <String> stack = new MyStack<>();
        stack.push("stack0");
        stack.push("stack1");
        stack.push("stack2");
        stack.push("stack3");
        stack.push("stack4");
        stack.push("stack5");
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("stack.size() = " + stack.size());
        stack.remove();
        stack.remove();
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("stack.pop() = " + stack.pop());
        for (String s : stack) {
            System.out.print(s + " ");
        }
        System.out.println("");

    }
}
