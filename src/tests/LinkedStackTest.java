package tests;
import customExceptions.EmptyStackException;
import org.junit.jupiter.api.Assertions;
import stack.LinkedStack;
import stack.Node;

class LinkedStackTest {

    private LinkedStack<Integer> list;
    private int elm1;
    private int elm2;
    private int elm3;
    private int elm4;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.list = new LinkedStack<>();
        this.elm1 = 1;
        this.elm2 = 2;
        this.elm3 = 3;
        this.elm4 = 4;
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Assertions.assertTrue(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isEmptyFalse() {
        list.push(elm1);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void push() {
        Assertions.assertTrue(list.isEmpty());
        list.push(elm1);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void pushMore() {
        Assertions.assertTrue(list.isEmpty());
        list.push(elm1);
        list.push(elm2);
        list.push(elm3);
        Assertions.assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void popNull() throws EmptyStackException {
        Assertions.assertThrows(EmptyStackException.class, () ->
        {
            Assertions.assertTrue(list.isEmpty());
            list.pop();
        });
    }

    @org.junit.jupiter.api.Test
    void pop() throws EmptyStackException {
        list.push(elm3);
        Assertions.assertFalse(list.isEmpty());
        Integer integer = list.pop();
        Assertions.assertEquals(integer, 3);
        Assertions.assertTrue(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void popMore() throws EmptyStackException {
        list.push(elm1);
        list.push(elm2);
        list.push(elm3);
        list.push(elm4);
        Assertions.assertFalse(list.isEmpty());
        Integer integer = list.pop();
        Assertions.assertEquals(integer, 4);
        Assertions.assertFalse(list.isEmpty());
        Integer integer1 = list.pop();
        Assertions.assertEquals(integer1, 3);
        Assertions.assertFalse(list.isEmpty());
        Integer integer2 = list.pop();
        Assertions.assertEquals(integer2, 2);
        Assertions.assertFalse(list.isEmpty());
        Integer integer3 = list.pop();
        Assertions.assertEquals(integer3, 1);
        Assertions.assertTrue(list.isEmpty());
    }
}