package BilaterallyLinkedList;

public class BilaterallyNode<E> {
    private E data;
    private BilaterallyNode<E> prev;
    private BilaterallyNode<E> next;

    BilaterallyNode(E data) {
        this.data = data;
    }

    public BilaterallyNode() {}

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BilaterallyNode<E> getPrev() {
        return prev;
    }

    public void setPrev(BilaterallyNode<E> prev) {
        this.prev = prev;
    }

    public BilaterallyNode<E> getNext() {
        return next;
    }

    public void setNext(BilaterallyNode<E> next) {
        this.next = next;
    }
}
