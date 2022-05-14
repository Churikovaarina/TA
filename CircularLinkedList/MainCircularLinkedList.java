package CircularLinkedList;

public class MainCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<Integer> cList = new CircularLinkedList<Integer>();
        try{
            cList.add(1);
            cList.add(4);
            cList.add(5);
            cList.add(6);
            cList.show();
            cList.deleteAt(3);
            cList.addAt(2,10);
            cList.show();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
