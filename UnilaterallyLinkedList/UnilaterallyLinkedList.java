package UnilaterallyLinkedList;

import Interfaces.LinkedList;

public class UnilaterallyLinkedList<E> implements LinkedList<E> {
    private UnilaterallyNode<E> head;
    private UnilaterallyNode<E> tail = null;

    public void addFirst(E data) {
        UnilaterallyNode<E> newNode = new UnilaterallyNode<>(data);
        newNode.setNextNode(head);
        head = newNode;
    }

    public void addAt(int index, E data) {
        UnilaterallyNode<E> new_Node = new UnilaterallyNode<>(data);
        UnilaterallyNode<E> node = head;

        for (int i = 0; i < index - 1; i++) node = node.getNextNode();
        new_Node.setNextNode(node.getNextNode());
        node.setNextNode(new_Node);
    }

    public void add(E data) {
        UnilaterallyNode<E> newNode = new UnilaterallyNode<>(data);

        if (this.head == null) head = newNode;
        else {
            UnilaterallyNode<E> currentNode = head;
            while (currentNode.getNextNode() != null) currentNode = currentNode.getNextNode();
            currentNode.setNextNode(newNode);
        }
    }

    public void deleteFirst() {
        if (this.head != null) {
            this.head = this.head.getNextNode();
        }
    }

    public void deleteAt(int index) {
        UnilaterallyNode<E> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void deleteLast() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                int count = 0;
                UnilaterallyNode<E> current = head;
                while (current.getNextNode() != tail) {
                    current = current.getNextNode();
                    count++;
                }
                deleteAt(count);
            } else {
                head = tail = null;
            }
        }
    }
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (UnilaterallyNode<E> x = head; x != null; x = x.getNextNode()) {
                if (x.getData() == null)
                    return index;
                index++;
            }
        } else {
            for (UnilaterallyNode<E> x = head; x != null; x = x.getNextNode()) {
                if (o.equals(x.getData()))
                    return index;
                index++;
            }
        }
        return -1;
    }
    public void show() {
        UnilaterallyNode<E> currentNode = head;
        if(currentNode == null){
            System.out.println("Linked list is empty");
        }
        else {
            while(currentNode != null) {
                System.out.print(currentNode.getData() + " ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println();
        }
    }
}
