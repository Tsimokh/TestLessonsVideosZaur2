package Lesson4_Collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
//        linkedList.add("Lesley");
//        linkedList.add("John");
//        linkedList.add("Mark");
//        linkedList.add("Mikkie");
//        linkedList.add("David");
        linkedList.offer("Lesley");
        linkedList.offer("John");
        linkedList.offer("Mark");
        linkedList.offer("Mikkie");
        linkedList.offer("David");
        System.out.println(linkedList);
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList.remove());
//        System.out.println(linkedList.remove());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.element());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.element());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.element());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.element());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.element());

//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.peek());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.peek());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.peek());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.peek());
//        System.out.println("remove element: " + linkedList.poll());
//        System.out.println(linkedList.peek());
        linkedList.remove("Mark");
        System.out.println(linkedList);
//        System.out.println(linkedList);
    }
}
