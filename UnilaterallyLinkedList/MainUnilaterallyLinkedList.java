package UnilaterallyLinkedList;


import QueStack.Queue;
import QueStack.Stack;

public class MainUnilaterallyLinkedList {
    public static void main(String[] args) {
        UnilaterallyLinkedList<String> list = new UnilaterallyLinkedList<String>();
        list.add("Hello");
        list.add("word");
        list.add("!!!");
        list.show();
        list.addFirst("hey");
        list.show();
        list.addAt(1,"dear");
        list.show();
        System.out.print("delete at position 1: ");
        list.deleteAt(1);
        list.show();
        System.out.print("delete first element: ");
        list.deleteFirst();
        list.show();
        System.out.print("delete last element: ");
        list.deleteLast();
        list.show();
        System.out.println("search index of an element: ");
        System.out.println(list.indexOf("word"));
    }
}
