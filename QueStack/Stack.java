package QueStack;

import UnilaterallyLinkedList.UnilaterallyNode;

public class Stack<E>{
    private UnilaterallyNode<E> head;
    private UnilaterallyNode<E> tail;

    void push(E data) {
        UnilaterallyNode<E> newNode = new UnilaterallyNode<>(data);

        if (this.head == null) head = newNode;
        else {
            UnilaterallyNode<E> currentNode = head;
            while (currentNode.getNextNode() != null) currentNode = currentNode.getNextNode();
            currentNode.setNextNode(newNode);
        }
    }

    void pop() {
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
                UnilaterallyNode<E> node = head;
                for (int i = 0; i < count - 1; i++) {
                    node = node.getNextNode();
                }
                node.setNextNode(node.getNextNode().getNextNode());
            } else {
                head = tail = null;
            }
        }
    }

    void clear(){
        head = tail = null;
    }

    void show() {
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
