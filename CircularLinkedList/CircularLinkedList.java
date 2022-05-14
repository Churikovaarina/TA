package CircularLinkedList;


import Interfaces.LinkedList;

public class CircularLinkedList<E> implements LinkedList<E> {
    private CircularNode<E> head;
    private CircularNode<E> tail;

    public void add(E data) {
        CircularNode<E> newNode = new CircularNode<>(data);

        if (this.head == null) head = newNode;
        else tail.setNextNode(newNode);

        tail = newNode;
        tail.setNextNode(head);
    }

    public void addFirst(E data) {
        CircularNode<E> newNode = new CircularNode<E>(data);

        if (this.head == null) {
            head = newNode;
            tail = newNode;
        } else tail.setNextNode(newNode);

        newNode.setNextNode(head);
        head = newNode;
    }

    public void addAt(int index, E data) {
        if (index > tailIndex()+1) throw new IndexOutOfBoundsException("Index cannot be larger than size");
        else {
            CircularNode<E> newNode = new CircularNode<E>(data);
            CircularNode<E> node = head;

            for (int i = 0; i < index - 1; i++) node = node.getNextNode();

            if (node.getNextNode() == head) add(data);
            else if (index == 0) addFirst(data);
            else {
                newNode.setNextNode(node.getNextNode());
                node.setNextNode(newNode);
            }
        }

    }

    public void deleteFirst() {
        if (head == null) throw new IndexOutOfBoundsException("List is empty");
        else {
            if (head == tail) head = tail = null;
            else {
                head = head.getNextNode();
                tail.setNextNode(head);
            }
        }
    }

    public void deleteLast() {
        if (this.head != null) {
            if (head == tail) head = tail = null;
            else {
                CircularNode<E> currentNode = head;
                while(currentNode.getNextNode() != tail)
                    currentNode = currentNode.getNextNode();
                tail = currentNode;
                tail.setNextNode(head);
            }
        } else throw new IndexOutOfBoundsException("List is empty");
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (CircularNode<E> x = head; x != null; x = x.getNextNode()) {
                if (x.getData() == null)
                    return index;
                index++;
                if (x.getNextNode() == head) break;

            }
        } else {
            for (CircularNode<E> x = head; x != null; x = x.getNextNode()) {
                if (o.equals(x.getData()))
                    return index;
                index++;
                if (x.getNextNode() == head) break;
            }
        }
        return -1;
    }

    public void deleteAt(int index) {
        CircularNode<E> node = head;

        if (index > tailIndex()) throw new IndexOutOfBoundsException("Index cannot be larger than size");
        else if (index == 0) deleteFirst();
        else {
            for (int i = 0; i < index - 1; i++) {
                node = node.getNextNode();
            }
            node.setNextNode(node.getNextNode().getNextNode());
        }
    }

    private int tailIndex() {
        int count = 0;
        CircularNode<E> currentNode = head;
        while (currentNode.getNextNode() != head) {
            currentNode = currentNode.getNextNode();
            count++;
        }
        return count;
    }

    public void show() {
        CircularNode<E> currentNode = head;

        if (head != null) {
            do {
                System.out.print(currentNode.getData() + " ");
                currentNode = currentNode.getNextNode();
            } while (currentNode != head);
            System.out.println();
        } else throw new IndexOutOfBoundsException("List is empty");
    }

}
