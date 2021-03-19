import CustomExceptions.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    public LinkedList<T> list;

    public LinkedStack()
    {
        this.list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T elm) {
        list.addToFront(elm);
    }

    @Override
    public T pop() throws EmptyStackException {
        try {
            return list.removeFirst();
        }
        catch (Exception e)
        {
            throw new EmptyStackException("The stack is empty");
        }
    }
}
