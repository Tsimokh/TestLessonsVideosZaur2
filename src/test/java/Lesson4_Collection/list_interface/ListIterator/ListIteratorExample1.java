package Lesson4_Collection.list_interface.ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {
    public static void main(String[] args) {
        String s1 = "madam";
        List<Character> listChar = new LinkedList<>();
        for (char ch: s1.toCharArray()) {
            listChar.add(ch);
        }
//        System.out.println(listChar);
        ListIterator iterator = listChar.listIterator();
        ListIterator reverseIterator = listChar.listIterator(listChar.size());
        boolean isPalindrome = true;
        while(iterator.hasNext()&&reverseIterator.hasPrevious()){
            if(iterator.next()!=reverseIterator.previous()){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The word is a palindrome");
        }else System.out.println("The word isn't palindrome");
    }
}

