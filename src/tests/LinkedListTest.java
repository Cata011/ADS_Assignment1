package tests;

import customExceptions.EmptyListException;
import org.junit.jupiter.api.Assertions;
import stack.LinkedList;
import stack.Node;

class LinkedListTest {

    private LinkedList<Integer> list;
    private Node<Integer> head;
    private int elm1;
    private int elm2;
    private int elm3;
    private int elm4;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.list = new LinkedList<>();
        this.elm1 = 1;
        this.elm2 = 2;
        this.elm3 = 3;
        this.elm4 = 4;
        this.head = new Node<>(elm1);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Assertions.assertTrue(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isEmptyFalse() {
        list.addToFront(elm1);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void sizeZero() {
        Assertions.assertEquals(list.size(), 0);
    }

    @org.junit.jupiter.api.Test
    void sizeOne() {
        list.addToFront(elm1);
        Assertions.assertEquals(list.size(), 1);
    }

    @org.junit.jupiter.api.Test
    void sizeMany() {
        list.addToFront(elm1);
        list.addToFront(elm2);
        Assertions.assertEquals(list.size(), 2);
    }

    @org.junit.jupiter.api.Test
    void addToFront() {
        Assertions.assertEquals(list.size(), 0);
        list.addToFront(elm1);
        Assertions.assertEquals(list.size(), 1);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addToFrontMany() {
        Assertions.assertEquals(list.size(), 0);
        list.addToFront(elm1);
        list.addToFront(elm2);
        list.addToFront(elm3);
        list.addToFront(elm4);
        Assertions.assertEquals(list.size(), 4);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void removeFirstEmpty() {
        Assertions.assertThrows(EmptyListException.class, () ->
                {
                    list.removeFirst();
                }
        );
    }

    @org.junit.jupiter.api.Test
    void removeFirstOne() throws EmptyListException {
        list.addToFront(elm1);
        Assertions.assertEquals(list.size(), 1);
        int nr = list.removeFirst();
        Assertions.assertEquals(list.size(), 0);
        Assertions.assertEquals(nr, elm1);

    }

    @org.junit.jupiter.api.Test
    void removeFirstMany() throws EmptyListException {
        list.addToFront(elm1);
        list.addToFront(elm2);
        list.addToFront(elm3);
        list.addToFront(elm4);
        Assertions.assertEquals(list.size(), 4);
        int nr = list.removeFirst();
        Assertions.assertEquals(list.size(), 3);
        Assertions.assertEquals(nr, elm4);

        int nr1 = list.removeFirst();
        Assertions.assertEquals(list.size(), 2);
        Assertions.assertEquals(nr1, elm3);

        int nr2 = list.removeFirst();
        Assertions.assertEquals(list.size(), 1);
        Assertions.assertEquals(nr2, elm2);

        int nr3 = list.removeFirst();
        Assertions.assertEquals(list.size(), 0);
        Assertions.assertEquals(nr3, elm1);
    }
}