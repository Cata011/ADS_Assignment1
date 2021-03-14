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
        head.setData(data);
    }

    @Override
    public T removeFirst() {
        return head.getNext().getData();
    }
}
