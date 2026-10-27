package Stacks;

import java.util.Stack;

public class StackDemo {
    static void main() {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> names = new Stack<>();
        names.push("omar");
        names.push("farah");
        names.push("hawa");
        names.push("gedi");
        System.out.println(names);
        System.out.println("size: " + names.size());
        System.out.println("last element: " + names.peek());

        String removed =  names.pop();
        System.out.println("removed element: " + removed);
        System.out.println("last element: " + names.peek());
        System.out.println("isEmpty: " + names.isEmpty());
    }
}
