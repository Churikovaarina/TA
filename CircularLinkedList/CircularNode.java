package CircularLinkedList;

public class CircularNode<E> {
    private E data;
    private CircularNode<E> nextNode;

    public CircularNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public CircularNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(CircularNode<E> nextNode) {
        this.nextNode = nextNode;
    }
}
