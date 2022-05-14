package UnilaterallyLinkedList;

public class UnilaterallyNode<E> {
    private E data;
    private UnilaterallyNode<E> nextNode;

    public UnilaterallyNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public UnilaterallyNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(UnilaterallyNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    /*    public UnilaterallyNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public UnilaterallyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(UnilaterallyNode nextNode) {
        this.nextNode = nextNode;
    }*/
}
