public class LinkedStack<T> implements Stack<T> {

    public LinkedList<T> list;

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T elm) {
        list.addToFront(elm);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }
}
