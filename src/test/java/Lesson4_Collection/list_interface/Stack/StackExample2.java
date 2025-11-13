package Lesson4_Collection.list_interface.Stack;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mike");
        stack.push("Sonia");
        stack.push("David");
        stack.push("Maria");
        stack.push("Mike");
        stack.push("Tyson");
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        while (!stack.isEmpty()) {
//            System.out.println(stack);
//            System.out.println(stack.pop());
//        }
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
