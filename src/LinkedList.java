public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    //constructor?

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        head.setNext(newNode);
        size++;
    }

    @Override
    public T removeFirst() throws Exception {
        if(isEmpty()) throw new Exception("List is empty");

        T firstNodeData = head.getData();
        head = head.getNext();
        size--;
        return firstNodeData;
    }
}
