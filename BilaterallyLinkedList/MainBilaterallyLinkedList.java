package BilaterallyLinkedList;

public class MainBilaterallyLinkedList {
    public static void main(String[] args) {

        BilaterallyLinkedList<Integer> list = new BilaterallyLinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(85);
        list.show();
        list.addFirst(11);
        list.show();
        list.addAt(3,99);
        list.show();
        list.deleteFirst();
        list.show();
        list.deleteLast();
        list.show();
        list.deleteAt(1);
        list.show();
        System.out.println(list.indexOf(99));

    }
}
