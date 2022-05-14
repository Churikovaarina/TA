package QueStack;

import UnilaterallyLinkedList.UnilaterallyNode;

public class Queue<E> {
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
        if (this.head != null) {
            this.head = this.head.getNextNode();
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
