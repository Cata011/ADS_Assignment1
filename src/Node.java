public class Node<T> {

    private Node<T> next;
    private T data;

    //constructor?

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    public void setNext(Node<T> node)
    {
        this.next = node;
    }

    public Node<T> getNext()
    {
        return next;
    }

}
