package BilaterallyLinkedList;


import Interfaces.LinkedList;

public class BilaterallyLinkedList<E> implements LinkedList<E> {
    private BilaterallyNode<E> head;

    public void addFirst(E data) {
        BilaterallyNode<E> new_Node = new BilaterallyNode<>(data);
        new_Node.setNext(head);
        new_Node.setPrev(null);
        if (head != null)
            head.setPrev(new_Node);
        head = new_Node;
    }

    public void addAt(int index, E data) {
        BilaterallyNode<E> new_Node = new BilaterallyNode<>(data);
        BilaterallyNode<E> node = head;

        for (int i = 0; i < index - 1; i++) node = node.getNext();
        new_Node.setNext(node.getNext());
        new_Node.setPrev(node.getPrev());
        node.setNext(new_Node);

    }

    public void add(E data){
        BilaterallyNode<E> new_Node = new BilaterallyNode<>(data);

        if (this.head == null) head = new_Node;
        else {
            BilaterallyNode<E> currentNode = head;
            while (currentNode.getNext() != null) currentNode = currentNode.getNext();
            currentNode.setNext(new_Node);
            new_Node.setPrev(currentNode);
            //new_Node.setNext(null);
        }
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head != null) {
            head = head.getNext();
        }
    }

    public void deleteAt(int index) {
        if (head == null || index < 0)
            return;
        BilaterallyNode<E> current = head;
        int i;
        for (i = 0; current != null && i < index; i++) {
            current = current.getNext();
        }
        if (current == null)
            return;
        deleteNode(current);
    }

    public void deleteLast() {
        if (this.head != null) {
            if (this.head.getNext() == null) {
                this.head = null;
            } else {
                BilaterallyNode<E> temp;
                temp = this.head;
                while (temp.getNext().getNext() != null)
                    temp = temp.getNext();
                temp.setNext(null);
            }


        }
    }

    public void deleteNode(BilaterallyNode<E> del) {
        if (head == null || del == null) {
            return;
        }
        if (head == del) {
            head = del.getNext();
        }
        if (del.getNext() != null) {
            del.getNext().setPrev(del.getPrev());
        }
        if (del.getPrev() != null) {
            del.getPrev().setNext(del.getNext());
        }
    }
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (BilaterallyNode<E> x = head; x != null; x = x.getNext()) {
                if (x.getData() == null)
                    return index;
                index++;
            }
        } else {
            for (BilaterallyNode<E> x = head; x != null; x = x.getNext()) {
                if (o.equals(x.getData()))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public void show() {
        BilaterallyNode<E> currentNode = head;
        if(currentNode == null){
            System.out.println("Linked list is empty");
        }
        else {
            while(currentNode != null) {
                System.out.print(currentNode.getData() + " ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }
    }
}
